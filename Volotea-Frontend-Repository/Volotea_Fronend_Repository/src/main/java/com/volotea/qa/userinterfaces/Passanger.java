package com.volotea.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Passanger {

    public static final Target CLOSE_COOKIES = Target
            .the("Se cierran las cookies")
            .located(By.id("onetrust-accept-btn-handler"));

    public static final Target CLICK_IN_PASSANGER = Target
            .the("Se da click en pasajero")
            .located(By.xpath("//input[@id='input-text_sf-passenger']"));

    public static final Target SELECT_PASSANGER = Target
            .the("Se Selecciona un pasajero Adulto")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[1]"));

    public static final Target SELECT_KIDS = Target
            .the("Se Selecciona un pasajero Niño")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[2]"));

    public static final Target SELECT_BABY = Target
            .the("Se Selecciona un pasajero Bebe")
            .located(By.xpath("(//span[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[3]"));


    public static final Target DELETE_PASSANGER = Target
            .the("Se elimina pasajero")
            .located(By.xpath("//*[@class='ng-star-inserted v7-btn-circle v7-btn-circle--sm']"));

    public static final Target NUMBER_VISIBLE_ADULT = Target
            .the("El numero de pasajeros es visible")
            .located(By.xpath("(//span[@class='v7-passenger__number ng-star-inserted'][normalize-space()])[1]"));

    public static final Target NUMBER_VISIBLE_CHILD = Target
            .the("El numero de pasajeros es visible")
            .located(By.xpath("(//span[@class='v7-passenger__number ng-star-inserted'][normalize-space()])[2]"));

    public static final Target NUMBER_VISIBLE_BABYS = Target
            .the("El numero de pasajeros es visible")
            .located(By.xpath(""));

}
