package com.example.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    Long id;

    String name;

}
