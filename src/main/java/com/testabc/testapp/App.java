package com.testabc.testapp;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

public class App {

	public static void main(String[] args) throws Exception {
	
	}
	   public static Set<Class<? extends Object>> getClazzSet(String pkg) {
	        // prepare reflection, include direct subclass of Object.class
	        Reflections reflections = new Reflections(new ConfigurationBuilder().setScanners(new SubTypesScanner(false), new ResourcesScanner())
	                .setUrls(ClasspathHelper.forClassLoader(ClasspathHelper.classLoaders(new ClassLoader[0])))
	                .filterInputsBy(new FilterBuilder().includePackage(pkg)));

	        return reflections.getSubTypesOf(Object.class);
	    }

	    public static void test() {
	        String pkg = "com.datayes.testapp";

	        Set<Class<? extends Object>> clazzSet = getClazzSet(pkg);
	        for (Class<? extends Object> clazz : clazzSet) {
	            System.out.println(clazz.getName());
	        }
	    }
}
