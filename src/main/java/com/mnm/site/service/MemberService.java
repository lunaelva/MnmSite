package com.mnm.site.service;

import org.springframework.stereotype.Service;

import com.mnm.site.entity.Member;

@Service
public interface MemberService {
	public boolean createMember(Member member);
}
