package com.user.git.practice.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {

    private int id;
    private String name;
    private String address;
}
