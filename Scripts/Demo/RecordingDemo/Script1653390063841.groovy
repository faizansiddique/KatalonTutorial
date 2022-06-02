import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Page_My Store/a_T-shirts'))

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Dresses'))

WebUI.click(findTestObject('Object Repository/Page_T-shirts - My Store/a_Dresses'))

WebUI.click(findTestObject('Object Repository/Page_Dresses - My Store/img_Add to Compare_replace-2x img-responsive'))

WebUI.click(findTestObject('Object Repository/Page_Dresses - My Store/img_Showing 1 - 5 of 5 items_replace-2x img_4353aa'))

WebUI.click(findTestObject('Object Repository/Page_Dresses - My Store/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Dresses - My Store/span_Continue shopping'))

WebUI.click(findTestObject('Object Repository/Page_Dresses - My Store/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Dresses - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/label_Email address'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email'), 'saasdaad@gmsm')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input_Password_passwd'), 'Cr0uZrBCzZjYaXYUtdU8ng==')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email'), 'saasdaad@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input_Password_passwd'), 'E0GrMauTnglNyF5cgMFRzA==')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Sign in'))

