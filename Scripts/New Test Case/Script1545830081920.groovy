import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/intl/en-GB/gmail/about/')

WebUI.click(findTestObject('Object Repository/Gmail/Page_Gmail - Free Storage and Email/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Gmail/Page_Gmail/input_Continue to Gmail_identi'), 'vamsiguntipalli@gmail.com')

WebUI.click(findTestObject('Object Repository/Gmail/Page_Gmail/span_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Gmail/Page_Gmail/input_Too many failed attempts'), 'N8yms9SlSVkfHmOuP5TexT6lJrneG8xN')

WebUI.click(findTestObject('Next'))

WebUI.click(findTestObject('Object Repository/Gmail/Page_Inbox (9) - vamsiguntipalligma/span_Search_gb_cb gbii'))

WebUI.click(findTestObject('Object Repository/Gmail/Page_Inbox (9) - vamsiguntipalligma/a_Sign out'))

WebUI.closeBrowser()

