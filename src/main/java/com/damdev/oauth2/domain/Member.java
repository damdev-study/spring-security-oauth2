package com.damdev.oauth2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String userName;
    private String remark;

    public Member(String name, String userName, String remark) {
        this.name = name;
        this.userName = userName;
        this.remark = remark;
    }
}
