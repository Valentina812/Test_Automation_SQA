package com.sqa.certification.plazavea.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddProductElements {
    //elements home
    public static final Target TXT_SEARCH_PRODUCT = Target.the("Text of search product")
            .located(By.xpath("//input[@id='search_box']"));
    //elements product
    public static final Target SLC_PRODUCT = Target.the("Product item selection")
            .located(By.xpath("//a[contains(text(),'Iphone 11 Apple 128Gb White')]"));
    public static final Target BTN_ADD_PRODUCT = Target.the("Button of add product to cart")
            .located(By.xpath("(//a[@id='ProductCard__add-to-cart'])[1]"));
    //elements shopping
    public static final Target SLC_CART = Target.the("Cart selection")
            .located(By.xpath("//div[@class='Header__cart']"));
    public static final Target BTN_CONTINUE = Target.the("Continue of shopping button")
            .located(By.xpath("//button[@class='button istertiary']"));
    public static final Target BTN_CONTINUE_TWO = Target.the("Continue of shopping button")
            .located(By.xpath("//a[@id= 'cart-to-orderform']"));
    public static final Target TXT_EMAIL = Target.the("Text of email of user")
            .located(By.xpath("//input[@id='client-pre-email']"));
    public static final Target SLC_ACCEPT_TERMS = Target.the("Accept terms of email")
            .located(By.xpath("//input[@id='termPersonalDataId']"));
    public static final Target BTN_CONTINUE_THREE = Target.the("Continue of shopping button")
            .located(By.xpath("//button[@class='btn btn-success']"));
    public static final Target TXT_VALIDATE_SHOPPING = Target.the("Text of validate shopping")
            .located(By.xpath("//span[contains(text(),'Iphone 11 Apple 128Gb White')]"));










}
