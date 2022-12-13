package com.course.msp.repository;

import com.course.msp.domain.dto.CalInfor;

import java.util.HashMap;
import java.util.Map;

public class DateCalRepository {

    private static final Map<String, CalInfor> calInfors = new HashMap<>();

    public CalInfor getInfors(String date){
        return calInfors.get(date);
    }
}
