package com.mnm.site.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mnm.site.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired 
	private MemberService memberService;
	
	@RequestMapping("/join/view")
    public String joinView() {
        return "/view/member/join";
    }
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public ModelAndView join(HttpServletRequest request, @RequestParam Map<String, String> param){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("json");	
		if(memberService.createMember(param)){
			mav.addObject("result", "success");
		}else{
			mav.addObject("result", "fail");
		}
		return mav;
	}
	
	
	@RequestMapping(value="/join/idCheck", method=RequestMethod.POST)
	public ModelAndView joinIdCheck(HttpServletRequest request, @RequestParam("id") String id){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("json");	
		
		if(memberService.isExistMember(id)){
			System.out.println("true");
		}
		return mav;
	}
}
