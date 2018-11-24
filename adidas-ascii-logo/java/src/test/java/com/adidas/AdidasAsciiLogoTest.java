package com.adidas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdidasAsciiLogoTest {

    private AdidasAsciiLogo adidasAsciiLogo;

    @Before
    public void setUp() {
        adidasAsciiLogo = new AdidasAsciiLogo();
    }


    @Test(expected = Exception.class)
    public void throw_exception_if_width_less_than_2() throws Exception {
        adidasAsciiLogo.createAdidasAsciiLogo(1);
    }
    @Test
    public void given_width_equal_2() throws Exception {

        String expected = new StringBuilder()
                .append("    @@")
                .append("\n")
                .append("  @@ @@")
                .append("\n")
                .append("@@ @@ @@")
                .append("\n").toString();
        assertEquals(expected, adidasAsciiLogo.createAdidasAsciiLogo(2));

    }
    @Test
    public void given_width_equal_3() throws Exception {

        String expected = new StringBuilder()
                .append("      @@@")
                .append("\n")
                .append("       @@@")
                .append("\n")
                .append("   @@@  @@@")
                .append("\n")
                .append("    @@@  @@@")
                .append("\n")
                .append("@@@  @@@  @@@")
                .append("\n")
                .append(" @@@  @@@  @@@")
                .append("\n")
                .toString();
        assertEquals(expected, adidasAsciiLogo.createAdidasAsciiLogo(3));
    }
    @Test
    public void given_width_equal_5() throws Exception {
        String expected = new StringBuilder()
                .append("          @@@@@")
                .append("\n")
                .append("           @@@@@")
                .append("\n")
                .append("     @@@@@  @@@@@")
                .append("\n")
                .append("      @@@@@  @@@@@")
                .append("\n")
                .append("@@@@@  @@@@@  @@@@@")
                .append("\n")
                .append(" @@@@@  @@@@@  @@@@@")
                .append("\n")
                .toString();
        assertEquals(expected, adidasAsciiLogo.createAdidasAsciiLogo(5));
    }
    @Test
    public void given_width_equal_7() throws Exception {

        String expected = new StringBuilder()
                .append("              @@@@@@@")
                .append("\n")
                .append("               @@@@@@@")
                .append("\n")
                .append("                @@@@@@@")
                .append("\n")
                .append("       @@@@@@@   @@@@@@@")
                .append("\n")
                .append("        @@@@@@@   @@@@@@@")
                .append("\n")
                .append("         @@@@@@@   @@@@@@@")
                .append("\n")
                .append("@@@@@@@   @@@@@@@   @@@@@@@")
                .append("\n")
                .append(" @@@@@@@   @@@@@@@   @@@@@@@")
                .append("\n")
                .append("  @@@@@@@   @@@@@@@   @@@@@@@")
                .append("\n")
                .toString();
        assertEquals(expected, adidasAsciiLogo.createAdidasAsciiLogo(7));
    }
    @Test
    public void given_width_equal_9() throws Exception {
        String expected = new StringBuilder()
                .append("                  @@@@@@@@@")
                .append("\n")
                .append("                   @@@@@@@@@")
                .append("\n")
                .append("                    @@@@@@@@@")
                .append("\n")
                .append("         @@@@@@@@@   @@@@@@@@@")
                .append("\n")
                .append("          @@@@@@@@@   @@@@@@@@@")
                .append("\n")
                .append("           @@@@@@@@@   @@@@@@@@@")
                .append("\n")
                .append("@@@@@@@@@   @@@@@@@@@   @@@@@@@@@")
                .append("\n")
                .append(" @@@@@@@@@   @@@@@@@@@   @@@@@@@@@")
                .append("\n")
                .append("  @@@@@@@@@   @@@@@@@@@   @@@@@@@@@")
                .append("\n")
                .toString();
        assertEquals(expected, adidasAsciiLogo.createAdidasAsciiLogo(9));
    }
    @Test
    public void given_width_equal_16() throws Exception {
        String expected = new StringBuilder()
                .append("                                @@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                                 @@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                                  @@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                                   @@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                 @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                  @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                   @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@")
                .append("\n")
                .append("@@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@")
                .append("\n")
                .append(" @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@")
                .append("\n")
                .append("  @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@")
                .append("\n")
                .append("   @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@")
                .append("\n")
                .toString();
        assertEquals(expected, adidasAsciiLogo.createAdidasAsciiLogo(16));
    }
    @Test
    public void given_width_equal_21() throws Exception {
        String expected = new StringBuilder()
                .append("                                          @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                                           @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                                            @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                                             @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                                              @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                      @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                       @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                        @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("                         @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("@@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append(" @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("  @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("   @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .append("    @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@")
                .append("\n")
                .toString();
        assertEquals(expected, adidasAsciiLogo.createAdidasAsciiLogo(21));
    }
}
