package com.example.demo.services.Impl;


import com.example.demo.dao.PyDataDao;
import com.example.demo.entity.PyData;
import com.example.demo.entity.PyResData;
import com.example.demo.services.PyDataService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("PyDataService")
public class PyDataServicesImpl  implements PyDataService {


    @Autowired
    PyDataDao pyDataDao;

//    @Override
//    public PageInfo<PyData> findAllUser(int pageNum, int pageSize) {
//        //将参数传给这个方法就可以实现物理分页了，非常简单。
//        PageHelper.startPage(pageNum, pageSize);
//        List<PyData> userDomains = pyDataDao.selectUsers();
//        PageInfo result = new PageInfo(userDomains);
//        return result;
//
//    }

    @Override
    public void adduser(String name, String iphone,String city) {
        PyData p = new PyData();
        p.setName(name);
        p.setIphone(iphone);
        p.setTitle(city);
        pyDataDao.adduserRest(p);
    }
}
