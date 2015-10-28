package com.mnm.site.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mnm.site.entity.Member;
import com.mnm.site.form.MemberForm;
import com.mnm.site.model.GenderModel;
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
	public ModelAndView join(HttpServletRequest request, @ModelAttribute("memberForm") MemberForm form){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("json");
		System.out.println("컨트롤러!!!");
		System.out.println(form.getUserId());
		String month = (form.getBirthMonth().length() < 2) ? "0"+form.getBirthMonth() : form.getBirthMonth() + "";
		String day = (form.getBirthDay().length() < 2) ? "0"+form.getBirthDay() : form.getBirthDay() + "";
		
		String birthStr = form.getBirthYear() + month + day;
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		try {
			date = df.parse(birthStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Member member = new Member();
		
		member.setBirth(date);
		member.setEmail(form.getEmail());
		member.setGender(getValueChange(form.getGender()).getValue());
		member.setNickName(form.getNickName());
		member.setOccTime(new Date());
		member.setPwd(form.getPwd());
		member.setStatus(1);
		member.setUserId(form.getUserId());
		member.setUserName(form.getUserName());
		
		if(memberService.createMember(member)){
			System.out.println("s");
		}else{
			System.out.println("f");			
		}
		
		return mav;
	}

	public GenderModel getValueChange(String param){
		GenderModel result = GenderModel.NONE;
		
		switch(param){
			case "M" : result = GenderModel.MALE;
				break;
			case "F" : result = GenderModel.FEMALE;
				break;
			default : result = GenderModel.NONE;
				
		}
		
		return result;
	}
}
