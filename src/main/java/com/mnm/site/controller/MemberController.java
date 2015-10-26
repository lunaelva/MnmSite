package com.mnm.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mnm.site.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired 
	private MemberRepository memberRepository;
	
	@RequestMapping("/join")
    public String velocity() {
        return "/view/member/join";
    }

}
