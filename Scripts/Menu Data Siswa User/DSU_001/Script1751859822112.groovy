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

WebUI.navigateToUrl('http://localhost/spk_mabac_entropy-main/login.php')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/MENU DATA SISWA USER/DSU_001 - Berhasil menambahkan data baru pada menu data siswa/Page_Sistem Pendukung Keputusan Metode Maba_e098f1/input_Masuk_username'), 
    'user')

WebUI.setEncryptedText(findTestObject('Object Repository/MENU DATA SISWA USER/DSU_001 - Berhasil menambahkan data baru pada menu data siswa/Page_Sistem Pendukung Keputusan Metode Maba_e098f1/input_Masuk_password'), 
    '1/VWEm4uipk=')

WebUI.click(findTestObject('Object Repository/MENU DATA SISWA USER/DSU_001 - Berhasil menambahkan data baru pada menu data siswa/Page_Sistem Pendukung Keputusan Metode Maba_e098f1/button_Masuk'))

WebUI.click(findTestObject('Object Repository/MENU DATA SISWA USER/DSU_001 - Berhasil menambahkan data baru pada menu data siswa/Page_Sistem Pendukung Keputusan Metode MABA_abf951/div_Selamat datang user Anda bisa mengopera_9e00cf'))

WebUI.click(findTestObject('Object Repository/MENU DATA SISWA USER/DSU_001 - Berhasil menambahkan data baru pada menu data siswa/Page_Sistem Pendukung Keputusan Metode MABA_abf951/a_Data Siswa'))

WebUI.click(findTestObject('Object Repository/MENU DATA SISWA USER/DSU_001 - Berhasil menambahkan data baru pada menu data siswa/Page_Sistem Pendukung Keputusan Metode MABA_abf951/a_Tambah Data Siswa'))

WebUI.setText(findTestObject('Object Repository/MENU DATA SISWA USER/DSU_001 - Berhasil menambahkan data baru pada menu data siswa/Page_Sistem Pendukung Keputusan Metode MABA_abf951/input_Nama Siswa_nama_siswa'), 
    'Ajib Ibra ')

WebUI.setText(findTestObject('Object Repository/MENU DATA SISWA USER/DSU_001 - Berhasil menambahkan data baru pada menu data siswa/Page_Sistem Pendukung Keputusan Metode MABA_abf951/input_Nomor Kelas_nomor_kelas'), 
    '3')

WebUI.click(findTestObject('Object Repository/MENU DATA SISWA USER/DSU_001 - Berhasil menambahkan data baru pada menu data siswa/Page_Sistem Pendukung Keputusan Metode MABA_abf951/button_Simpan'))

WebUI.click(findTestObject('Object Repository/MENU DATA SISWA USER/DSU_001 - Berhasil menambahkan data baru pada menu data siswa/Page_Sistem Pendukung Keputusan Metode MABA_abf951/div_Data berhasil disimpan'))

WebUI.click(findTestObject('Object Repository/MENU DATA SISWA USER/DSU_001 - Berhasil menambahkan data baru pada menu data siswa/Page_Sistem Pendukung Keputusan Metode MABA_abf951/a_2'))

WebUI.closeBrowser()

