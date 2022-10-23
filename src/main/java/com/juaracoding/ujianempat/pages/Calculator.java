package com.juaracoding.ujianempat.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Calculator {

    private AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Operator
    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    private MobileElement hasil;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_div")
    private MobileElement btnBagi;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    private MobileElement btnPengurangan;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    private MobileElement btnKali;
    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    private MobileElement btnSamaDengan;

    //Angka
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_8")
    private MobileElement btnDelapan;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    private MobileElement btnEmpat;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_9")
    private MobileElement btnSembilan;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_7")
    private MobileElement btnTujuh;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_6")
    private MobileElement btnEnam;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    private MobileElement btnDua;



    public void calcAddBagi() {
        btnDelapan.click();
        btnBagi.click();
        btnEmpat.click();
        btnSamaDengan.click();
    }

    public void calcAddPengurangan() {
        btnSembilan.click();
        btnPengurangan.click();
        btnTujuh.click();
        btnSamaDengan.click();
    }

    public void calcAddKali() {
        btnEnam.click();
        btnKali.click();
        btnDua.click();
        btnSamaDengan.click();
    }

    public void calcGabungan(){
        btnEnam.click();
        btnKali.click();
        btnDelapan.click();
        btnBagi.click();
        btnDua.click();
        btnPengurangan.click();
        btnEmpat.click();
        btnSamaDengan.click();
    }

    public void calcSubstract(){
        btnEnam.click();
        btnPengurangan.click();
        btnTujuh.click();
        btnSamaDengan.click();
    }

    public String getTxtResult() {
        return hasil.getText();
    }
}
