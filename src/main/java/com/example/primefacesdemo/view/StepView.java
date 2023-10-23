package com.example.primefacesdemo.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.stereotype.Component;

@Component
@ManagedBean
@ViewScoped
public class StepView {

    private int activeIndex = 0;

    public int getActiveIndex() {
        return activeIndex;
    }

    public void nextStep() {
        if (activeIndex < 3) { // 3 é o índice da última etapa
            activeIndex++;
        }else {
        	activeIndex   = 0;
        }
    }
}
