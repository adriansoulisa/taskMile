import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class login {
 /**
* The step definitions below match with Katalon sample Gherkin steps
*/
@Given ('User open Mile By Paket ID Click Masuk will to login')
	def login(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://taskdev.mile.app/login')
	}

	@And ('User input organization')
	def UserInputOrganization(String Organization){
		WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Login/input_Back to Mile_organization'), 'testonboard')
		
	}

	@When ('User Click Masuk')
	def clickButtonLoginInApps(){
		WebUI.click(findTestObject('Object Repository/Page_Mileapp  Login/button_Login'))
	}
	@Then ('User success Login')
	def succesLogin(){
		WebUI.delay(5)

	}
	
	@Given ('User first login after input organization')
	def firstLoginApp(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://taskdev.mile.app/login')
	}

	@And ('User inputusername and password')
	def UserInputusernameandpassword(String username, String password ){
		WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Login/input_Email Address or Username_email or username'),
	'cek skenario negatif')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mileapp  Login/input_Password_password'), 'oEX9qHDSiuw=')
	}

	@When ('User Click Masuk')
	def clickButtonLoginInApps(){
		WebUI.click(findTestObject('Object Repository/Page_Mileapp  Login/button_Login'))
	}
	@Then ('User success Login Apps')
	def succesLogin(){
		WebUI.delay(15)
		WebUI.closeBrowser()

	}



 
}