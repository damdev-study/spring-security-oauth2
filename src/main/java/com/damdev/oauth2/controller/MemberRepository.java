package com.damdev.oauth2.controller;

import com.damdev.oauth2.domain.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource// 도메인 객체가 member 이므로 path는 members로 자동생성
//@RepositoryRestResource(path = "user") // path 설정을 수동(user)으로 잡을 시
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {

}
