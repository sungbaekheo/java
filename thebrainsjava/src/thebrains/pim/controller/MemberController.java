package thebrains.pim.controller;

import java.util.HashMap;
import java.util.Map;

import thebrains.pim.model.Member;
import thebrains.pim.service.MemberService;
import thebrains.pim.service.MemberServiceImpl;
import thebrains.pim.view.TUIView;

public class MemberController { // 요청을 제어하는 요소
	// MVC(Model - view - Control) 모델 기반 -> MVCS (MVC-Service)
	// 개인정보 관리 시스템(Personal Information System) 개발
	// C.R.U.D ( Create, Read, Update, Delete ) : 자료를 처리하는 기본 기능
	// 추가 기능: 정렬, 검색, 페이지
	
	//MemberView memberView = null;
	MemberService<Member> memberService = null;
	public static TUIView tui = new TUIView();
	public static final String MEMBER_DB = "memberdb.txt"; // 상수 변수 
	
	public static Map<String, Member> session = new HashMap<String, Member>();
	
	public MemberController() {
		memberService = new MemberServiceImpl<Member>();
	}
	public void dispatch() {
        //memberView = new MemberView();
        Member sessionMember = null; // session에 저장된 객체를 처리하는 데 사용
        Member member = null; // 임시적으로 사용할 목적

        boolean isLogin = false; // 로그인 여부
        boolean isRoot = false; // 관리자 여부

       // 파일로 부터 등록된 사용자 정보 읽기
        memberService.readFile();

        int menu = 0; // 0 입력 시 종료
        do {
            sessionMember = session.get("member"); // 로그인 성공 시 null이 아님
            if (sessionMember != null) {
                isLogin = true;
                if (sessionMember.getEmail().toString().equals("admin04@induk.ac.kr"))
                    isRoot = true;
            } else {
                isLogin = false;
                isRoot = false;
            }

            tui.showMenu(isLogin, isRoot); // 로그인 여부, 루트 여부에 따라 메뉴가 다름
            menu = tui.inputMenu();
            switch (menu) {
                case 0:// 종료 : 로그아웃, 파일로 저장
                    memberService.logout();
                    memberService.saveFile();
                    break;
                case 1:
                    member = new Member();
                    member.setMno(MemberController.tui.inputMno()); // 1001번 증가되지 않는 오류 해결
                    boolean isUnique; // 이메일 중복 확인
                    String email = MemberController.tui.inputEmail();
                    member.setEmail(email);
                    member.setPw(MemberController.tui.inputPw());
                    member.setName(MemberController.tui.inputName());
                    member.setPhone(MemberController.tui.inputPhone());
                    member.setAddress(MemberController.tui.inputAddress());
                    //while (!isValid(member)) //유효성 확인
                    //    ;
                    if(memberService.postMember(member) > 0)
                        memberService.applyUpdate();
                    else
                        //memberView.printFail("등록 ");
                    break;
                case 2: // 로그인
                	sessionMember = memberService.login(tui.inputEmail(), tui.inputPw());
                	break;
            }
        }while(menu != 0);
	/*
	public void dispatch() { // dispatch: 시작의 의미, 명령을 가져옴
		memberService.readFile();
		int menu = 0; // 0은 종료
		Member member = null;
		do  {
			boolean isLogin = true;
			boolean isRoot = true;
			// true, true: root 로그인, true, false: 사용자 로그인,
			tui.showMenu(isLogin, isRoot);
			menu = tui.inputMenu();
			System.out.println("입력하신 메뉴는 \"" + menu + "\"입니다.");
		} while(menu != 0);
	*/
	}

}


// controller - > service -> repository
// repository -> service -> controller -> 