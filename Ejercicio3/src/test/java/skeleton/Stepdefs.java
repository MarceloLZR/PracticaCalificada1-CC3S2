package skeleton;

import io.cucumber.java.en.When;


public class Stepdefs {

    // Expresion regular para numeros positivos
    @When("^test_posint (\\d+)$")
    public void test_posint(int number) throws Throwable {
        System.out.println("test_posint true for: " + number);
    }

    // Expresion regular para flotantes
    @When("^test_float (-?\\d+\\.\\d+)$")
    public void test_float(float arg1) throws Throwable {
        System.out.println("test_float true for: " + arg1);
    }

    // Expresion regular para codincidir la ID
    @When("^test_ip_address (\\b(?:\\d{1,2}|[01]?\\d{2}|2[0-4]\\d|25[0-5])\\.(?:\\d{1,2}|[01]?\\d{2}|2[0-4]\\d|25[0-5])\\.(?:\\d{1,2}|[01]?\\d{2}|2[0-4]\\d|25[0-5])\\.(?:\\d{1,2}|[01]?\\d{2}|2[0-4]\\d|25[0-5])\\b)$")
    public void test_ip_address(String arg1) throws Throwable {
        System.out.println("test_ip_address true for: " + arg1);
    }

    // Pattern distinguisher
    @When("^test_splitter (spill|Sponge|tap|rebuild)$")
    public void test_splitter(String match) throws Throwable {
        System.out.println("test_splitter true for: " + match);
    }

    // Pattern distinguisher 2
    @When("^test_splitter2 (spill|Sponge|tap|rebuild)$")
    public void test_splitter2(String match) throws Throwable {
        System.out.println("test_splitter2 true for: " + match);
    }
}
