package com.jpabook.jpashop.domain;

public class OrderSearch {

    //회원이름
    private String memberName;

    //주문상태[ORDER, CANCEL]
    private OrderStatus orderStatus;

    //Getter, Setter
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
