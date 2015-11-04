package com.mnm.site.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface MemberService {
	public boolean createMember(Map<String, String> param);

	public boolean isExistMember(String id);
}
