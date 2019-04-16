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

WebUI.navigateToUrl('http://172.16.156.232:8070/Q20/')

WebUI.click(findTestObject('Page_QUIPUCAMAYOC 20/a_Iniciar sesin'))

WebUI.setText(findTestObject('Page_QUIPUCAMAYOC 20/input_Usuario_mlkuser'), '40269482')

WebUI.setEncryptedText(findTestObject('Page_QUIPUCAMAYOC 20/input_Contrasea_mlkpass'), 'VIjOZClaB9I=')

WebUI.click(findTestObject('Page_QUIPUCAMAYOC 20/span_Iniciar Sesin_button-1026-btnIconEl'))

WebUI.click(findTestObject('Page_QUIPUCAMAYOC 20/table_BandejaBandeja de tareas y actividades del usuario'))

WebUI.click(findTestObject('Page_QUIPUCAMAYOC 20/span_Nuevo'))

WebUI.click(findTestObject('Page_QUIPUCAMAYOC 20/a__tab-1016'))

WebUI.click(findTestObject('Page_QUIPUCAMAYOC 20/td_Calendario Presupuestal'))

WebUI.click(findTestObject('Page_QUIPUCAMAYOC 20/span_Buscar'))

