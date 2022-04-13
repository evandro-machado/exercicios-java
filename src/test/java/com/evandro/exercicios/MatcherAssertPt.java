package com.evandro.exercicios;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;

public class MatcherAssertPt {
    public MatcherAssertPt() {
    }

    public static <T> void assertThat(T actual, Matcher<? super T> matcher) {
        assertThat("", actual, matcher);
    }

    public static <T> void assertThat(String reason, T actual, Matcher<? super T> matcher) {
        if (!matcher.matches(actual)) {
            Description description = new StringDescription();
            description.appendText(reason).appendText(System.lineSeparator()).appendText("Valor Esperado: ").appendDescriptionOf(matcher).appendText(System.lineSeparator()).appendText("     mas: ");
            matcher.describeMismatch(actual, description);
            String portugueseDescription = description.toString()
                    .replace("is", "é")
                    .replace("was", "foi");

            throw new AssertionError(portugueseDescription);
        }
    }

    public static void assertThat(String reason, boolean assertion) {
        if (!assertion) {
            throw new AssertionError(reason);
        }
    }
}