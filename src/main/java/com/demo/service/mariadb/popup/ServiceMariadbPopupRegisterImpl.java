package com.demo.service.mariadb.popup;

import com.demo.repository.mariadb.popup.RepositoryMariadbPopupRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("serviceMariadbPopupRegister")
public class ServiceMariadbPopupRegisterImpl implements ServiceMariadbPopupRegister {

    @Autowired
    private RepositoryMariadbPopupRegister repositoryMariadbPopupRegister;

    // 글 등록
    @Override
    public void registerContent(Map<String, Object> jsonData) {
        // todo 1. 유효성 검증.

        // todo 2. repository 계층으로 전달.
        repositoryMariadbPopupRegister.insertContent(jsonData);
    }
}
