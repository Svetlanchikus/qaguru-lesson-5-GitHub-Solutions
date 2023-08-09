import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Lessen5 {

    @Test
        // Откырть  GitHub
        // Выбрать меню Solutions -> Enterprize с помощью команды hover для Solutions.
        // Проверить, что на странице  есть заголовок - "Build like the best."
    void checkingPresenceText() {
        open("https://github.com/");
        $(byTagAndText("button", "Solutions")).hover();
        $(byTagAndText("a", "Enterprise")).click();
        $(withTagAndText("h1", "Build like the best")).shouldHave(visible);
    }

    @Test

        //  Откройте https://the-internet.herokuapp.com/drag_and_drop
        //  Перенесите прямоугольник А на место В
        //  Проверьте, что прямоугольники действительно поменялись

    void actionsDragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").dragAndDrop(to("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
