package com.example.SpringBasic;

import com.example.SpringBasic.pages.HomePage;
import com.example.SpringBasic.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBasicApplicationTests {

	@Autowired
	private HomePage homePage;

	@Autowired
	private LoginPage loginPage;

	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Value("testing")
	private String environment;

	@Test
	void contextLoads() {
		homePage.Navigate(appUrl);
		homePage.clickLogin();
		loginPage.Login("admin","password");
		loginPage.clickLogin();


	}

}
