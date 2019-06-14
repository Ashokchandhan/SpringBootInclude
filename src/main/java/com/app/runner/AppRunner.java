package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

public class AppRunner implements CommandLineRunner{

	@Value("${my.appname}")
	private String appName;


	@Value("${my.db.driver}")
	private String dbDriver;


	@Value("${my.ab.url}")
	private String dburl;


	@Value("${my.email.host}")
	private String emailHost;


	@Value("${my.email.port}")
	private int emailport;
	@Override
	public void run(String... args) throws Exception {

		System.out.println(this);

	}
	@Override
	public String toString() {
		return "AppRunner [appName=" + appName + ", dbDriver=" + dbDriver + ", dburl=" + dburl + ", emailHost="
				+ emailHost + ", emailport=" + emailport + "]";
	}

}
