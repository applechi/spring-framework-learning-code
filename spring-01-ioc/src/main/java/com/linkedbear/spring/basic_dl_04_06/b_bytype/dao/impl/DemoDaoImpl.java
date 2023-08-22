package com.linkedbear.spring.basic_dl_04_06.b_bytype.dao.impl;

import com.linkedbear.spring.basic_dl_04_06.b_bytype.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {

    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
