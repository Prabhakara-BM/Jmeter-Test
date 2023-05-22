package FeeManagement;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.FeeManagementPage;
import Pages.HomePage1;
import Pages.LoginClass;

public class feeManagementSuperAdminTest extends BaseTest {
	LoginClass LC;

	HomePage1 HP;

	FeeManagementPage FM;

	public feeManagementSuperAdminTest() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();

		FM = new FeeManagementPage();

		LC = new LoginClass();

		HP = LC.EmailLogin(prop.getProperty("username"), prop.getProperty("password"));

	}

	@BeforeMethod
	public void refresh() {
		WaitTil(2000);
		driver.navigate().refresh();
		WaitTil(2000);
	}

	@Test(priority = 1)
	public void Overview() throws InterruptedException {
		System.out.println("--------The test case 1 was started------- ");
		WaitTil(2000);
		FM.validateFeemanagementPage();
		WaitTil(2000);
		System.out.println("--------The Overview test case was passed------- ");

	}

	@Test(priority = 2)
	public void GenerateOnlineRequest() throws InterruptedException {
		System.out.println("--------The test case 2 was started------- ");
		WaitTil(2000);
		FM.GeneratePaymentRequest();
		System.out.println("--------The Individual GeneratePaymentRequest test case was passed------- ");
		WaitTil(2000);
		FM.PaymentRequestForClass();
		System.out.println("--------The Class GeneratePaymentRequest test case was passed------- ");

	}

	@Test(priority = 3)
	public void AddOfflinePaymnet() throws InterruptedException {
		System.out.println("--------The test case 3 was started------- ");
		WaitTil(2000);
		FM.AddAllOfflinePaymnets();
		System.out.println("--------The AddOfflinePaymnet test case was passed------- ");

	}

	@Test(priority = 4)
	public void Transaction() throws InterruptedException {
		System.out.println("--------The test case 4 was started------- ");
		Thread.sleep(2000);
		FM.Transaction();
		System.out.println("--------The Transaction test case was passed------- ");
	}

	@Test(priority = 5)
	public void AllStudents() throws InterruptedException {
		System.out.println("--------The test case 5 was started------- ");
		Thread.sleep(2000);
		FM.studentAll();
		System.out.println("--------The AllStudents test case was passed------- ");
	}

	@Test(priority = 6)
	public void RecentActivityLogs() throws InterruptedException {

		System.out.println("--------The test case 6 was started------- ");
		WaitTil(3000);
		FM.recentActivity();
		System.out.println("--------The RecentActivityLogs test case was passed------- ");

	}

	
	 @AfterSuite public void taerDown()
	 { 
		 driver.quit(); 
		 
	 }
	 
}
