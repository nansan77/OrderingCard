package ru.netology.web;


import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestApplicationForm {
    void shouldSubmitRequest() {
        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Василий");
        $("[data-test-id=phone] input").setValue("+79270000000");
        $("[data-test-id=agreement]").click();
        $("[type=button]").click();
        $("[data-test-id=order-success]").shouldHave(exactText("  Ваша заявка успешно " +
                "отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
