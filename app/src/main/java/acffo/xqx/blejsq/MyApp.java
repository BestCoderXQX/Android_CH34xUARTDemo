package acffo.xqx.blejsq;

import android.app.Application;

import cn.wch.ch34xuartdriver.CH34xUARTDriver;

public class MyApp extends Application {
	public static CH34xUARTDriver driver;         //需要将CH34x的驱动类写在APP类下面，使得帮助类的生命周期与整个应用程序的生命周期是相同的
}
