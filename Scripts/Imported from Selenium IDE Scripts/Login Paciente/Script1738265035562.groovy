import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.Keys
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

'----------------------------------------------------'
'This test case script is generated by Katalon Studio'
'Generated date: 30-ene.-2025 02:23:55 p. m.'
'File path: C:\\Users\\miguel.reyes\\Documents\\Pruebas automatizadas Agendamiento DEMO\\Agendamiento.side'
'Generated by: null'
'----------------------------------------------------'

String baseUrl = "https://agendamiento-frontend-c-demo-fmfqb3apb8egfnb5.eastus2-01.azurewebsites.net"

WebUI.openBrowser('')

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"open | /login/ingreso |  | "
// Method open is not supported

"setWindowSize | 652x678 |  | "
// Method setWindowSize is not supported

"click | id=inputBaseuserName |  | "
// Method click is not supported

"type | id=inputBaseuserName | 54321_pa | "
// Method type is not supported

"click | id=inputBasepassword |  | "
// Method click is not supported

"type | id=inputBasepassword | 99081701187Mm. | "
// Method type is not supported

"selectFrame | index=0 |  | "
// Method selectFrame is not supported

"click | css=.recaptcha-checkbox-border |  | "
// Method click is not supported

"selectFrame | relative=parent |  | "
// Method selectFrame is not supported

"click | css=.btn-04 |  | "
// Method click is not supported
