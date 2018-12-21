package com.demo.repository.mariadb.popup;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

@Repository
public class RepositoryMariadbPopupRegister {

    // --------------------------------------- ▼ SPRING BOOT 이전 방식 ▼ ---------------------------------------
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://127.0.0.1:3306/test";
    private static final String USER = "root"; //db 접속 id
    private static final String PW = "my024712"; //db 접속 password
    private Connection connection; // connection 객체

    private void _setConnection(Connection connection) {
        this.connection = connection;
    }
    private Connection _getConnection() {
        return this.connection;
    }

    @PostConstruct // 환경 설정
    private void _configuration() throws Exception {
        Class.forName(DRIVER);
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PW);
            this._setConnection(connection);

            System.out.println("현재 Connection 객체: " + connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // --------------------------------------- ▲ SPRING BOOT 이전 방식 ▲ ---------------------------------------

    public void insertContent(Map<String, Object> jsonData) {
        System.out.println("repository - insertContent");
        System.out.println(jsonData);
        System.out.println("나중 Connection 객체: " + this._getConnection());
    }
}
