package com.ll.global.initData;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@RequiredArgsConstructor
public class NotProd {
    @Autowired
    @Lazy
    private NotProd self;
    private final MemberService memberService;
    private final ArticleService articleService;

    @Bean
    public ApplicationRunner initNotProd() {
        return args -> {
            System.out.println("Not Prod");
            self.work1();
        };
    }

    @Transactional
    public void work1() {
        Member member1 = memberService.join("admin", "1234", "관리자", "admin@test.com").getData();

        Article article1 = articleService.write(member1, "제목", "내용").getData();
    }
}
