package com.hcl.flagpicker.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.run;

/**
 * @author Dinesh P
 * FlagPickerApplication is the main class for Flag Picker API
 */
@SpringBootApplication
@ComponentScan({"com.hcl.flagpicker.*"}) 
public class FlagPickerApplication {

	public static void main(String[] args) {
		run(FlagPickerApplication.class, args);
	}

}
