package e.a1346116.tictactoe;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.app.PendingIntent.getActivity;
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class TicTacToeFragmentTest {
    @Rule
    public ActivityTestRule<MainActivity> m_activityRule = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void testResultat() {
        onView(withId(R.id.joueurCourant)).check(matches(withText("X")));
        onView(withId(R.id.btn_1)).perform(click());
        onView(withId(R.id.btn_1)).check(matches(withText("X")));
        onView(withId(R.id.joueurCourant)).check(matches(withText("O")));
        onView(withId(R.id.btn_1)).perform(click());
        onView(withId(R.id.btn_1)).check(matches(withText("X")));
        onView(withId(R.id.joueurCourant)).check(matches(withText("O")));

        onView(withId(R.id.btn_4)).perform(click());
        onView(withId(R.id.btn_4)).check(matches(withText("O")));
        onView(withId(R.id.joueurCourant)).check(matches(withText("X")));

        onView(withId(R.id.btn_2)).perform(click());
        onView(withId(R.id.btn_2)).check(matches(withText("X")));
        onView(withId(R.id.joueurCourant)).check(matches(withText("O")));

        onView(withId(R.id.btn_5)).perform(click());
        onView(withId(R.id.btn_5)).check(matches(withText("O")));
        onView(withId(R.id.joueurCourant)).check(matches(withText("X")));

        onView(withId(R.id.btn_3)).perform(click());
        onView(withId(R.id.btn_3)).check(matches(withText("X")));
        onView(withId(R.id.joueurCourant)).check(matches(withText("O")));

        onView(withText(R.string.ToastGagner)).inRoot(withDecorView(not(is(m_activityRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));

        onView(withId(R.id.btnReset)).perform(click());
        onView(withId(R.id.btn_1)).check(matches(withText(" ")));
        onView(withId(R.id.btn_4)).check(matches(withText(" ")));
        onView(withId(R.id.btn_2)).check(matches(withText(" ")));
        onView(withId(R.id.btn_5)).check(matches(withText(" ")));
        onView(withId(R.id.btn_3)).check(matches(withText(" ")));
        onView(withId(R.id.joueurCourant)).check(matches(withText("X")));

        onView(withId(R.id.btn_2)).perform(click());
        onView(withId(R.id.btn_1)).perform(click());
        onView(withId(R.id.btn_5)).perform(click());
        onView(withId(R.id.btn_3)).perform(click());
        onView(withId(R.id.btn_7)).perform(click());
        onView(withId(R.id.btn_4)).perform(click());
        onView(withId(R.id.btn_9)).perform(click());
        onView(withId(R.id.btn_8)).perform(click());
        onView(withId(R.id.btn_6)).perform(click());

        onView(withText(R.string.ToastNulle)).inRoot(withDecorView(not(is(m_activityRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }
}
