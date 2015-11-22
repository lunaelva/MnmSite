package com.mnm.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mnm.site.entity.MemberInfo;
import com.mnm.site.repository.BaseRepository;
import com.mnm.site.repository.MemberRepository;
 
@Controller
@RequestMapping("/")
public class MainController {
	@Autowired 
	private MemberRepository memberRepository;
	
    @RequestMapping
    public String index() {
        return "intro";
    }
    
    @RequestMapping("/users")
    public @ResponseBody List<MemberInfo> getUserList() {
        return memberRepository.findAll();
    }
    
    @RequestMapping("/velocity")
    public String velocity() {
        return "intro";
    }
}