package com.example.demo.data.dto;

import lombok.*;

public class MemberFindDto {

    @Data
    public static class Request{
        private String name;
        private String id;
    }

    @Getter
    @ToString
    @Builder
    @EqualsAndHashCode(callSuper = true)
    public static class Response extends CommonResponse{
        private String id;
        private String comment;
    }

}
