import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'----------------------------------------------------'

'This test case script is generated by Katalon Studio'

'Generated date: 30-ene.-2025 02:23:55 p. m.'

'File path: C:\\Users\\miguel.reyes\\Documents\\Pruebas automatizadas Agendamiento DEMO\\Agendamiento.side'

'Generated by: null'

'----------------------------------------------------'
WebUI.openBrowser('')

WebUI.maximizeWindow()

// Paso 1: Navegar a la URL de login
WebUI.navigateToUrl('https://agendamiento-frontend-c-pruebas-ehe5c9fyb7gwehed.eastus2-01.azurewebsites.net/login/ingreso')

// Esperar a que el botón de inicio de sesión esté presente y visible
WebUI.waitForElementPresent(findTestObject('Login/btnLogin'), 10)

WebUI.waitForElementVisible(findTestObject('Login/btnLogin'), 10)

// Hacer clic en el botón de inicio de sesión
WebUI.click(findTestObject('Login/btnLogin'))

// Ingresar el nombre de usuario
WebUI.setText(findTestObject('Login/input_usuario'), 'MiguelPruebas')

// Ingresar la contraseña
WebUI.setText(findTestObject('Login/input_password'), '99081701187Mm.')

// Hacer clic en el reCAPTCHA
WebUI.switchToFrame(findTestObject('Login/iframe_recaptcha'), 0)

WebUI.click(findTestObject('Login/checkbox_recaptcha'))

WebUI.switchToDefaultContent()

// Pausar 30 segundos para que el tester pueda resolver el reCAPTCHA
WebUI.delay(30)

// Hacer clic en el botón de login
WebUI.click(findTestObject('Login/btn_login'))

// Interacciones con el menú
WebUI.mouseOver(findTestObject('Caracteristicas/Menu'))

WebUI.mouseOver(findTestObject('Caracteristicas/Menu'))

// Hacer clic en el icono de configuración
WebUI.click(findTestObject('Caracteristicas/Menu'))

// Interacciones con el submenú
WebUI.mouseOver(findTestObject('Caracteristicas/Menu'))

WebUI.mouseOver(findTestObject('Caracteristicas/Menu'))

WebUI.mouseOver(findTestObject('Caracteristicas/Menu'))

// Navegar a la sección de Parametrizacion
WebUI.click(findTestObject('Caracteristicas/Parametrizacion'))

// Navegar a la sección de caracteristicas
WebUI.click(findTestObject('Caracteristicas/Caracteristica'))

// Crear nueva caracteristica
WebUI.click(findTestObject('Caracteristicas/Agregar'))

// Click especialidad
WebUI.click(findTestObject('Caracteristicas/contieneSelect'))

// Selecciona una especialidad
WebUI.click(findTestObject('Caracteristicas/itemSelect_Req'))

// Hacer clic en el elemento con el ID 'inputBasecharacteristicName'
WebUI.click(findTestObject('Caracteristicas/inputBasecharacteristicName'))

// Generar un término médico aleatorio
def terminosMedicos = ['Radiografía de tórax', 'Tomografía computarizada', 'Resonancia magnética', 'Ultrasonido abdominal'
    , 'Mamografía', 'Angiografía', 'Densitometría ósea', 'Ecocardiograma', 'Gammagrafía ósea', 'PET scan']

// Seleccionar un término aleatorio
Random random = new Random()

def terminoAleatorio = terminosMedicos[random.nextInt(terminosMedicos.size())]

// Escribir el término aleatorio en el campo de texto con el ID 'inputBasecharacteristicName'
WebUI.setText(findTestObject('Caracteristicas/inputBasecharacteristicName'), terminoAleatorio)

// Hacer clic en guardar
WebUI.click(findTestObject('Caracteristicas/Guardar'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Caracteristicas/Aceptar'))

// Click Ultima Pagina
WebUI.click(findTestObject('Caracteristicas/Ultima_Page'))

// Cambiar estado
WebUI.waitForElementVisible(findTestObject('Caracteristicas/Estado'), 10)

WebUI.waitForElementPresent(findTestObject('Caracteristicas/Estado'), 10)

WebUI.click(findTestObject('Caracteristicas/Estado'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Caracteristicas/Aceptar'))

// Editar la última especialidad creada
WebUI.waitForElementVisible(findTestObject('Caracteristicas/Editar'), 10)

WebUI.waitForElementPresent(findTestObject('Caracteristicas/Editar'), 10)

WebUI.click(findTestObject('Caracteristicas/Editar'))

terminoAleatorio = (terminosMedicos[random.nextInt(terminosMedicos.size())])

WebUI.setText(findTestObject('Caracteristicas/inputBasecharacteristicName'), terminoAleatorio)

// Hacer clic en guardar
WebUI.click(findTestObject('Caracteristicas/Guardar'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Caracteristicas/Aceptar'))

// Click Ultima Pagina
WebUI.click(findTestObject('Caracteristicas/Ultima_Page'))

// Eliminar la última Caracteristica
WebUI.waitForElementVisible(findTestObject('Caracteristicas/Eliminar'), 10)

WebUI.waitForElementPresent(findTestObject('Caracteristicas/Eliminar'), 10)

WebUI.click(findTestObject('Caracteristicas/Eliminar'))

WebUI.click(findTestObject('Caracteristicas/Aceptar'))

// Cerrar navegador
WebUI.closeBrowser()

