//package com.atticus.community.service;
//
//import com.atticus.community.dao.AlphaDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//
//@Service
////@Scope("prototype")
//public class AlphaService {
//
//    private AlphaDao alphaDao;
//
//    @Autowired
//    public void setAlphaDao(AlphaDao alphaDao) {
//        this.alphaDao = alphaDao;
//    }
//
//    public AlphaService() {
//        System.out.println("实例化AlphaService");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("初始化AlphaService");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("销毁AlphaService");
//    }
//
//    public String find() {
//        return alphaDao.select();
//    }
//
//}
