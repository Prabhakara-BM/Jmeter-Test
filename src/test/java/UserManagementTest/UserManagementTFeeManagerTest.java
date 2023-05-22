package UserManagementTest;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import OldPages.UserManagementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.UserManagement;
import Util.TestUtil;

public class UserManagementTFeeManagerTest extends BaseTest {

	LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;

	UserManagement UM;

	public UserManagementTFeeManagerTest() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();
		LC = new LoginClass();
		UM = new UserManagement();

		HP = UM.addaUserPrev("Teacher", "NoPriv", "NoPriv", "Priv3", "NoPriv", "NoPriv", "NoPriv",  prop.getProperty("DefaultOTP"));
		WaitTil(2000);
		
		
	
		//HP = LC.MobileLogin(prop.getProperty("SuperAdminNumber"), prop.getProperty("DefaultOTP"));
	

	}
	
	
	@Test(priority = 1)
	public void validateUserManagementPage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 1 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateUserManagementPage();
		System.out.println("Test case 1 Completed ");
			
	}

	
	@Test(priority = 2) 
	public void validateTeacherGrowthSummary() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 2 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickTeacherViewMore();
		WaitTil(2000);
		UM.growthSummary();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 2 Completed ");
	}
	@Test(priority = 3) 
	public void validateSortingTeacherandSearch() throws InterruptedException, AWTException {
		WaitTil(2000);
		System.out.println("Test case 3 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickTeacherViewMore();
		WaitTil(2000);
		UM.validateSortingSelector();
		WaitTil(2000);
		UM.searchUserName();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 3 Completed ");
	}
	
	@Test(priority = 4) 
	public void validateDataOperatorGrowthSummary() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 4 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickDataoperatorViewMore();
		WaitTil(2000);
		UM.growthSummary();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 4 Completed ");
	}
	@Test(priority = 5) 
	public void validateSortingDataOperatorandSearch() throws InterruptedException, AWTException {
		WaitTil(2000);
		System.out.println("Test case 5 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickDataoperatorViewMore();
		WaitTil(2000);
		UM.validateSortingSelector();
		WaitTil(2000);
		UM.searchUserName();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 5 Completed ");
	}
	//

	@Test(priority = 6) 
	public void validateOperationGrowthSummary() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 6 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickOperationViewMore();
		WaitTil(2000);
		UM.growthSummary();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 6 Completed ");
	}
	@Test(priority = 7) 
	public void validateSortingOperationandSearch() throws InterruptedException, AWTException {
		WaitTil(2000);
		System.out.println("Test case 7 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickOperationViewMore();
		WaitTil(2000);
		UM.validateSortingSelector();
		WaitTil(2000);
		UM.searchUserName();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 7 Completed ");
	}
	//
	@Test(priority = 8)
	public void ChangeUsers() throws InterruptedException
	{
		System.out.println("Test case 8 started ");
		WaitTil(2000);
		UM.changeUsersType();
		System.out.println("Test case 8 Completed ");
	}

	
	@Test(priority = 9) 
	public void validateStudentGrowthSummary() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 9 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.growthSummary();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 9 Completed ");
	}
	@Test(priority = 10) 
	public void validateUnassignedViewAllPage() throws InterruptedException, AWTException {
		WaitTil(2000);
		System.out.println("Test case 10 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.validateUnassignedViewAllPage();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 10 Completed ");
	}
	
	
	
	
}
