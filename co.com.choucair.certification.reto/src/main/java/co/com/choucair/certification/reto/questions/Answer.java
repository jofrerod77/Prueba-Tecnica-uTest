package co.com.choucair.certification.reto.questions;

import co.com.choucair.certification.reto.userinterface.TextVerified;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String strVerified;

    public Answer (String strVerified){
        this.strVerified = strVerified;
    }

    public static Answer toThe(String strVerified){
        return new Answer(strVerified);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textVerified = Text.of(TextVerified.TEXT_VERIF).viewedBy(actor).asString();
        if(strVerified.equals(textVerified)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
