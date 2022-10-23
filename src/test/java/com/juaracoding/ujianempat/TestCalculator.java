package com.juaracoding.ujianempat;

import static org.testng.Assert.assertEquals;

import com.juaracoding.ujianempat.pages.Calculator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCalculator {

    private static AndroidDriver<MobileElement> driver;
    private Calculator calculator;



    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "vivo 1915");
        capabilities.setCapability("uuid", "YHDYGYFUOVBACMUS");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @BeforeMethod
    public void pageObject() {
        calculator = new Calculator(driver);
    }

    @Test (priority = 2)
    public void testAddBagi() {
        calculator.calcAddBagi();
        System.out.println("Hasil = "+calculator.getTxtResult());
        assertEquals(calculator.getTxtResult(), "2");
    }

    @Test (priority = 1)
    public void testAddKali() {
        calculator.calcAddKali();
        System.out.println("Hasil = "+calculator.getTxtResult());
        assertEquals(calculator.getTxtResult(), "12");
    }

    @Test (priority = 3)
    public void TestAddPengurangan() {
        calculator.calcAddPengurangan();
        System.out.println("Hasil = "+calculator.getTxtResult());
        assertEquals(calculator.getTxtResult(), "2");
    }

    @Test (priority = 4)
    public void TestGabungan() {
        calculator.calcGabungan();
        System.out.println("Hasil = "+calculator.getTxtResult());
        assertEquals(calculator.getTxtResult(), "20");
    }

    @Test (priority = 5)
    public void testSubstract() {
        calculator.calcSubstract();
        System.out.println("Hasil = "+calculator.getTxtResult());
        String actual = calculator.getTxtResult();
        char charActual = actual.charAt(0);
        int cekASCII = (int) charActual;
        System.out.println(cekASCII);
        int cekASCIIFromKeyboardMinus = '-';
        System.out.println(cekASCIIFromKeyboardMinus);
        Assert.assertEquals(actual, "−1");
    }

    @AfterClass
    public void closeApp() {
        driver.quit();
    }

}
