package company.com;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

public class AccountTest  {
    Account account1 = new Savings();
    Account account2 = new Check();

    @Test
    public void test1() throws Exception{
        double value = account1.intrest(1000);
        Assert.assertEquals(value,100.0);

    }
    @Test
    public void test2() throws Exception{
        double value = account2.intrest(1000);
        Assert.assertEquals(value,100.0);

    }

}