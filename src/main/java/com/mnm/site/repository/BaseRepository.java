package com.mnm.site.repository;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
/***
 *  repository는 구현체가 없다..
 *  메서드로 호출
 * @author lunamaan
 * 
 */
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface BaseRepository <T, ID extends Serializable> extends Repository<T, ID> {
	T findOne(ID id);
	List<T> findAll();
	T save(T entity);
}

