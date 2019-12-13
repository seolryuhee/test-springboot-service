package com.park.book.springboot.domain.posts;

import com.park.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// 클래스 내 모든 필드의 Getter 메서드 자동 생성
@Getter
// 기본 생성자 자동 추가
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    //PK 필드 선언
    @Id
    // PK 생성 규칙(auto_increment)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //column 변경하고 싶을 때 사용
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    //해당 클래스의 빌더 패턴 클래스 생성
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
