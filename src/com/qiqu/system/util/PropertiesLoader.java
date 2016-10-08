package com.qiqu.system.util;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class PropertiesLoader {
	public static Resource resource;

	public static Properties props;

	static {
		resource = new FileSystemResourceLoader()
				.getResource("classpath:/config/config.properties");
		try {
			props = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getPropertiesVal(String key) {
		return props.getProperty(key);
	}
}
