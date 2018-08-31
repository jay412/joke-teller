package builditbigger.lib.test;

import org.junit.Test;

import builditbigger.lib.Joker;

class JokerTest {
    @Test
    public void test() {
        Joker joker = new Joker();
        assert joker.getJoke().length() != 0;
    }
}
