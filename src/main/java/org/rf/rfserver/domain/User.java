package org.rf.rfserver.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;
    private String name;
    private String loginId;
    private String password;
    private String nickName;
    private String university;
    private String phoneNumber;
    private String interestingLanguage;
    private String introduce;
    private String useLanguage;
    private String mbti;
    private int entrance;
    private int like;
    private int dislike;
    private LocalDateTime createdDate;

    @OneToMany(mappedBy = "user")
    private List<InterestCountry> interestCountries;
    @OneToMany(mappedBy = "user")
    private List<UserInterest> userInterest;
}
