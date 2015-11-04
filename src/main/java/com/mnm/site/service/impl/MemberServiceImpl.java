package com.mnm.site.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnm.site.entity.Member;
import com.mnm.site.form.MemberForm;
import com.mnm.site.repository.MemberRepository;
import com.mnm.site.service.MemberService;
import com.mnm.site.util.MemberUtil;

@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService{	

	@Autowired 
	private MemberRepository memberRepository;
	
	@Override
	public boolean createMember(Map<String, String> param){
		boolean result = false;
		
		String month = (param.get("birthMonth").length() < 2) ? "0"+param.get("birthMonth") : param.get("birthMonth") + "";
		String day = (param.get("birthDay").length() < 2) ? "0"+param.get("birthDay") : param.get("birthDay") + "";
		
		String birthStr = param.get("birthYear") + month + day;
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
		member.setEmail(param.get("email"));
		member.setGender(MemberUtil.getValueChange(param.get("gender")).getValue());
		member.setNickName(param.get("nickname"));
		member.setOccTime(new Date());
		member.setPwd(param.get("pwd"));
		member.setStatus(1);
		member.setUserId(param.get("userId"));
		member.setUserName(param.get("userName"));
		
		try{			
			memberRepository.save(member);
			result = true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	

	@Override
	public boolean isExistMember(String id){
		boolean result = false;
		return result;
	
	}
}
