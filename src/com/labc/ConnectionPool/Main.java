package com.labc.ConnectionPool;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		new UserInterface();
		PoolManager.loadProperties();
		PoolManager.loadDrivers();
	}
}
