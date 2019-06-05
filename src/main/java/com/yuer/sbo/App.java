package com.yuer.sbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * /**
 * 类功能描述：</br>
 * SpringBoot HelloWorld
 * 关于编写启动器需要注意的问题
 * 启动器存放的位置。启动器可以和 controller 位于同一个包下，或者位于 controller 的上一级
 * 包中，但是不能放到 controller 的平级以及子包下。
 * @author 于亚豪
 * @version 1.0 </p> 修改时间：</br> 修改备注：</br>
 */
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		/**
		 * 第一个参数：当前启动类的模板对象
		 * 第二个参数：main方法里面 的agrs
		 */
		SpringApplication.run(App.class,args);
	}
}
