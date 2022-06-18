package com.example.demo.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Root {
    private String table;
    private String currency;
    private String code;
    private List<Rate> rates;
}
