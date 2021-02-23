package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception{
		//String sql = "INSERT INTO user (id, login, password, role) VALUES (?, ?, ?, ?)";
		//jdbcTemplate.update(sql, 1, "jakub", "pass", "admin");

                /*
                for(int i = 2; i<=8; i++){
                        jdbcTemplate.update(sql, i, "Janko", "pass", "user");
                }*/

	}

}