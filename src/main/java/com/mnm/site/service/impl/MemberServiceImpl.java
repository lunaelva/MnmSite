package com.mnm.site.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnm.site.entity.Member;
import com.mnm.site.repository.MemberRepository;
import com.mnm.site.service.MemberService;

@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService{	

	@Autowired 
	private MemberRepository memberRepository;
	
	@Override
	public boolean createMember(Member member){
		boolean result = false;
		try{			
			memberRepository.save(member);
			result = true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
}
