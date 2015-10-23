package com.mnm.site.repository;
/***
 *  repository는 구현체가 없다..
 *  메서드로 호출
 * @author lunamaan
 * 
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.mnm.site.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
