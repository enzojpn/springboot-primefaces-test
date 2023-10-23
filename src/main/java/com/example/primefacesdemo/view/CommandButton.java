package com.example.primefacesdemo.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.stereotype.Component; 

@Component
@ManagedBean
@ViewScoped
public class CommandButton {
	public void commandButtonAction() {
		System.out.println("teste action");
	}
 
}