package Task3;

import java.util.ArrayList;
import java.util.Random;

public class FortuneCookieFactory {

    private final FortuneConfig fortuneConfig;
    private int cookiesBaked = 0;

    private final Random rnd = new Random();
    private final ArrayList<String> goodFortune;
    private final ArrayList<String> badFortune;

    public FortuneCookieFactory(FortuneConfig fortuneConfig, ArrayList<String> goodFortune, ArrayList<String> badFortune) {
        this.fortuneConfig = fortuneConfig;
        this.goodFortune = goodFortune;
        this.badFortune = badFortune;
    }

    public int getCookiesBaked() {
        return this.cookiesBaked;
    }

    public void resetCookiesCreated() {
        this.cookiesBaked = 0;
    }

    public FortuneCookie bakeFortuneCookie() {
        final String fortune;

        if (this.fortuneConfig.isPositive()) {
            fortune = goodFortune.get(rnd.nextInt(goodFortune.size()));
        } else {
            fortune = badFortune.get(rnd.nextInt(badFortune.size()));
        }
        incrementNumberOfCookiesCreated();
        return new FortuneCookie(fortune);
    }

    private void incrementNumberOfCookiesCreated() {
        this.cookiesBaked++;
    }
}