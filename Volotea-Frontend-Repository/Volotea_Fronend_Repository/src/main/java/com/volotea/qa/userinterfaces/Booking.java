package com.volotea.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Booking {
    public static final Target DEPARTURE_DATE = Target
            .the("Select Departure date")
            .located(By.xpath("//label[@for='sf-departure']"));

    public static final Target SEARCH = Target
            .the("Search month in the panel")
            .located(By.xpath("(//input[@type='text'])[7]"));
    public static final Target SEARCH_MONTH = Target
            .the("Search month")
            .located(By.xpath("//li[@class='v7-input-select__item ng-star-inserted'][6]"));

    public static final Target SELECT_DEPARTURE_DATE = Target
            .the("Select Departure date and value")
            .locatedBy("//sf-calendar-day[@class='v7-cal__day block-ui-click ng-star-inserted']//div[@id='vol-anchor-scroll-month-13']");

    //*[@id='vol-month-11']//sf-calendar-day[5]//p
        public static final Target RETURN_DATE = Target
            .the("Select Return Date")
            .locatedBy("//sf-calendar-day[@class='v7-cal__day block-ui-click ng-star-inserted']//span[@class='v7-cal__price ng-star-inserted']");
    //*[@id="vol-month-10"]//sf-calendar-day[26]//p
    public static final Target ENTER_FLIGHT = Target
            .the("enter in find flight")
            .located(By.xpath("//*[@id='search-btn']//span[1]"));

    public static final Target SCROLL_PAGE = Target
            .the("Scroll page")
            .located(By.xpath("//div[@class='v7-popin__content v7-popin__content--main v7-popin__content--with-footer']"));

    public static final Target SAVE_BUTTON = Target
            .the("Save data")
            .located(By.xpath("//span[@class='v7-btn__text v7-btn__text--icon ng-star-inserted']"));

}
//*[@class='v7-cal__day block-ui-click ng-star-inserted'][1]
//v7-cal__day block-ui-click v7-is-in-range ng-star-inserted
