package test_java;
import org.testng.Assert;
//import org.testing.Assert;
import org.testng.annotations.Test;
import husna.*;
import test_java.apptest;

public class apptest {
@Test

public void test1()
{
	app  myapp=new app();
	Assert.assertEquals(0, myapp.userLogin("Riyan","husna321"));
}
@Test

public void test2()
{
	app myapp=new app();
	  Assert.assertEquals(1, myapp.userLogin("Riyan","husn@323"));	
}
}