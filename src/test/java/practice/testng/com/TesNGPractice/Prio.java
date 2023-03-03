package practice.testng.com.TesNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Prio {
	
		@BeforeSuite
		private void tc001() {
		System.out.println("TC001");
		}
		@BeforeTest
		private void TC002() {
			System.out.println("TC002");
		}
		@BeforeClass
		private void TC003() {
			System.out.println("TC003");
		}
		@BeforeMethod
		private void TC004() {
			System.out.println("TC004");
		}
		@test
		private void TC005() {
			System.out.println("TC005");
		
		}
		@AfterMethod
		private void TC006() {
			System.out.println("TC006");
		}
		@AfterClass
		private void TC007() {
			System.out.println("TC007");

		}
		@AfterTest
		private void TC008() {
			System.out.println("TC008");
		}
		@AfterSuite
		private void TC009() {
			System.out.println("TC009");
		}
}
