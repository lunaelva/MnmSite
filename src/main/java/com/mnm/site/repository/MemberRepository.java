package com.mnm.site.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mnm.site.entity.MemberInfo;

public interface MemberRepository  extends JpaRepository<MemberInfo, Long> {
}
