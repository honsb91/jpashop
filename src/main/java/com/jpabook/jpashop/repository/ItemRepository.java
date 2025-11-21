package com.jpabook.jpashop.repository;

import com.jpabook.jpashop.domain.item.Item;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepository {

    private final EntityManager em;

    //상품등록
    public void save(Item item){
        if (item.getId() == null){
            em.persist(item);
        }else{
            em.merge(item);
        }
    }

    //상품 단건조회
    public Item findOne(Long id){
        return em.find(Item.class,id);
    }

    //전체 상품목록 조회
    public List<Item> findAll(){
        return em.createQuery("select i from Item i", Item.class)
                .getResultList();
    }
}
