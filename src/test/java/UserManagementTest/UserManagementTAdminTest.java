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

public class UserManagementTAdminTest extends BaseTest {

	LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;

	UserManagement UM;

	public UserManagementTAdminTest() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();
		LC = new LoginClass();
		UM = new UserManagement();

		HP = UM.addaUserPrev("Teacher", "Priv1", "NoPriv", "NoPriv", "NoPriv", "NoPriv", "NoPriv",  prop.getProperty("DefaultOTP"));
		WaitTil(2000);
		
		
	
		//HP = LC.MobileLogin(prop.getProperty("SuperAdminNumber"), prop.getProperty("DefaultOTP"));
	

	}
	

	@Test(priority = 1) 
	public void userCreations() throws InterruptedException {
		System.out.println("Test case 1 User Management  started ");
		WaitTil(2000);
		UM.clickUserManagement();
		WaitTil(2000);
		UM.addaUser("Student","NoPriv","NoPriv","NoPriv","NoPriv","NoPriv","NoPriv");
		WaitTil(2000);
		UM.addaUser("Teacher","NoPriv","NoPriv","NoPriv","NoPriv","NoPriv","NoPriv");
		WaitTil(2000);
		UM.addaUser("DataOperator","NoPriv","NoPriv","NoPriv","NoPriv","NoPriv","NoPriv");
		WaitTil(2000);
		UM.addaUser("Operation","NoPriv","NoPriv","NoPriv","NoPriv","NoPriv","NoPriv");
		for(int i=0;i<4;i++) {
		WaitTil(2000);
		UM.DeleteUser();
		}
	}
	
	@Test(priority = 2)
	public void validateUserManagementPage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 2 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateUserManagementPage();
		System.out.println("Test case 2 Completed ");
			
	}
	
	@Test(priority = 3) 
	public void registrationRequestsApprovals() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 3 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.registrationRequestsApprovals();
		System.out.println("Test case 3 Completed ");
	}
	
	@Test(priority = 4) 
	public void validateRegistrationRequestsPage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 4 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateRegistrationRequestsPage();
		WaitTil(2000);
		System.out.println("Test case 4 Completed ");
		
	}
	
	@Test(priority = 5) 
	public void validateTeacherCreation() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 5 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickTeacherViewMore();
		WaitTil(2000);
		UM.vieworeAddaUser("NoPriv", "NoPriv", "NoPriv", "NoPriv", "NoPriv", "NoPriv");
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 5 Completed ");
	}
	@Test(priority = 6) 
	public void validateEditTeacher() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 6 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickTeacherViewMore();
		WaitTil(2000);
		UM.validateEditUserProfile();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 6 Completed ");
	}
	@Test(priority = 7) 
	public void validateTeacherDeletion() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 7 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickTeacherViewMore();
		WaitTil(2000);
		UM.DeleteUser();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 7 Completed ");
	}
	@Test(priority = 8) 
	public void validateTeacherGrowthSummary() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 8 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickTeacherViewMore();
		WaitTil(2000);
		UM.growthSummary();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 8 Completed ");
	}
	@Test(priority = 9) 
	public void validateSortingTeacherandSearch() throws InterruptedException, AWTException {
		WaitTil(2000);
		System.out.println("Test case 9 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickTeacherViewMore();
		WaitTil(2000);
		UM.validateSortingSelector();
		WaitTil(2000);
		UM.searchUserName();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 9 Completed ");
	}
	
	@Test(priority = 10) 
	public void validateDataOperatorCreation() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 10 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickTeacherViewMore();
		WaitTil(2000);
		UM.vieworeAddaUser("NoPriv", "NoPriv", "NoPriv", "NoPriv", "NoPriv", "NoPriv");
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 10 Completed ");
	}
	@Test(priority = 11) 
	public void validateEditDataOperator() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 11 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickDataoperatorViewMore();
		WaitTil(2000);
		UM.validateEditUserProfile();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 11 Completed ");
	}
	@Test(priority = 12) 
	public void validateDataOperatorDeletion() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 12 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickDataoperatorViewMore();
		WaitTil(2000);
		UM.DeleteUser();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 12 Completed ");
	}
	@Test(priority = 13) 
	public void validateDataOperatorGrowthSummary() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 13 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickDataoperatorViewMore();
		WaitTil(2000);
		UM.growthSummary();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 13 Completed ");
	}
	@Test(priority = 14) 
	public void validateSortingDataOperatorandSearch() throws InterruptedException, AWTException {
		WaitTil(2000);
		System.out.println("Test case 14 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickDataoperatorViewMore();
		WaitTil(2000);
		UM.validateSortingSelector();
		WaitTil(2000);
		UM.searchUserName();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 14 Completed ");
	}
	//

	@Test(priority = 15) 
	public void validateOperationCreation() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 15 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickOperationViewMore();
		WaitTil(2000);
		UM.vieworeAddaUser("NoPriv", "NoPriv", "NoPriv", "NoPriv", "NoPriv", "NoPriv");
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 15 Completed ");
	}
	@Test(priority = 16) 
	public void validateEditOperation() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 16 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickOperationViewMore();
		WaitTil(2000);
		UM.validateEditUserProfile();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 16 Completed ");
	}
	@Test(priority = 17) 
	public void validateOperationDeletion() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 17 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickOperationViewMore();
		WaitTil(2000);
		UM.DeleteUser();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 17 Completed ");
	}
	@Test(priority = 18) 
	public void validateOperationGrowthSummary() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 18 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickOperationViewMore();
		WaitTil(2000);
		UM.growthSummary();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 18 Completed ");
	}
	@Test(priority = 19) 
	public void validateSortingOperationandSearch() throws InterruptedException, AWTException {
		WaitTil(2000);
		System.out.println("Test case 19 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickOperationViewMore();
		WaitTil(2000);
		UM.validateSortingSelector();
		WaitTil(2000);
		UM.searchUserName();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 19 Completed ");
	}
	//
	@Test(priority = 20)
	public void ChangeUsers() throws InterruptedException
	{
		System.out.println("Test case 20 started ");
		WaitTil(2000);
		UM.changeUsersType();
		System.out.println("Test case 20 Completed ");
	}

	@Test(priority = 21) 
	public void validateStudentCreation() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 21 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.vieworeAddaUser("NoPriv", "NoPriv", "NoPriv", "NoPriv", "NoPriv", "NoPriv");
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 21 Completed ");
	}
	@Test(priority = 22) 
	public void validateEditStudentProfile() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 22 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.validateEditStudentProfile();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 22 Completed ");
	}
	@Test(priority = 23) 
	public void validateStudentDeletion() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 23 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.DeleteUser();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 23 Completed ");
	}
	@Test(priority = 24) 
	public void validateStudentGrowthSummary() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 24 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.growthSummary();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 24 Completed ");
	}
	@Test(priority = 25) 
	public void validateUnassignedViewAllPage() throws InterruptedException, AWTException {
		WaitTil(2000);
		System.out.println("Test case 25 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.validateUnassignedViewAllPage();
		WaitTil(2000);
		UM.BackButton();
		System.out.println("Test case 25 Completed ");
	}
	
	
	
	
}
