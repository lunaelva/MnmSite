package com.mnm.site.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	
	@ResponseBody
	@RequestMapping(value="/idCheck", method=RequestMethod.POST)
	public Boolean joinIdCheck(HttpServletRequest request, @RequestParam("id") String userId){
		
		if(memberService.isExistMember(userId)){
			System.out.println("true");
		}
		return true;
	}
	
	@ResponseBody
	@RequestMapping(value="/nickCheck", method=RequestMethod.POST)
	public Boolean joinNickCheck(HttpServletRequest request, @RequestParam("nickName") String nickName){
		System.out.println("nickName : " + nickName);
		String memberNick = "관리자";
		
		if(nickName.equals(memberNick)){
			return false;
		}
		
		if(memberService.isExistMember(memberNick)){
			System.out.println("true");
		}
//		if(memberService.isExistMember(id)){
//			System.out.println("true");//
//		}
		return true;
	}
}
