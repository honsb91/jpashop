package com.jpabook.jpashop.repository;

import com.jpabook.jpashop.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    //회원저장
    public void save(Member member){
        em.persist(member);
    }

    //회원 단건 조회
    public Member findOne(Long id){
        return em.find(Member.class, id);
    }

    //회원목록
    public List<Member> findAll(){
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    //회원 이름으로 검색
    public List<Member> findByName(String name){
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name",name)
                .getResultList();
    }
}
