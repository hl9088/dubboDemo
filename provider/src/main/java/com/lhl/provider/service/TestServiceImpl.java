package com.lhl.provider.service;

public class TestServiceImpl implements ITestService {
    @Override
    public String sayHello(String message) {
        return message;
    }
}
