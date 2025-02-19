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

// Abrir navegador y maximizar
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
WebUI.mouseOver(findTestObject('Especialidades/Menu'))

WebUI.mouseOver(findTestObject('Especialidades/Menu'))

// Hacer clic en el icono de configuración
WebUI.click(findTestObject('Especialidades/Menu'))

// Interacciones con el submenú
WebUI.mouseOver(findTestObject('Especialidades/Menu'))

WebUI.mouseOver(findTestObject('Especialidades/Menu'))

WebUI.mouseOver(findTestObject('Especialidades/Menu'))

// Navegar a la sección de Parametrizacion
WebUI.click(findTestObject('Especialidades/Parametrizacion'))

// Navegar a la sección de especialidad
WebUI.click(findTestObject('Especialidades/Especialidad'))

// Crear nueva especialidad
WebUI.click(findTestObject('Especialidades/Agregar'))

// Hacer clic en el elemento con el selector CSS (.contieneSelect > div)
WebUI.click(findTestObject('Especialidades/divContieneSelect'))

// Esperar a que el elemento con el XPath (//div[contains(@id, 'cdk-overlay')]/div) sea visible
WebUI.waitForElementVisible(findTestObject('Especialidades/divCdkOverlay'), 5)

// Ejecutar un script JavaScript para hacer clic en el último elemento de la lista
String script = '\n    const items = document.evaluate(\n        \'//div[contains(@id, "cdk-overlay")]/div//li\',\n        document,\n        null,\n        XPathResult.ORDERED_NODE_SNAPSHOT_TYPE,\n        null\n    );\n    if (items.snapshotLength > 0) {\n        items.snapshotItem(items.snapshotLength - 1).click();\n    } else {\n        throw new Error(\'No se encontraron elementos <li> en la lista.\');\n    }\n'

WebUI.executeJavaScript(script, null)

// Hacer clic en el elemento con el ID 'inputBasespecialtiesName'
WebUI.click(findTestObject('Especialidades/inputBasespecialtiesName'))

// Generar un término médico aleatorio
def terminosMedicos = ['Radiología', 'Radiología Intervencionista', 'Medicina Nuclear', 'Ultrasonografía (Ecografía)', 'Neurorradiología'
    , 'Cardiorradiología', 'Radiología Pediátrica', 'Radiología Oncológica', 'Radiología Musculoesquelética', 'Mamografía (Especialidad en Imágenes de Mama)']

// Seleccionar un término aleatorio
Random random = new Random()

def terminoAleatorio = terminosMedicos[random.nextInt(terminosMedicos.size())]

// Escribir el término aleatorio en el campo de texto con el ID 'inputBasespecialtiesName'
WebUI.setText(findTestObject('Especialidades/inputBasespecialtiesName'), terminoAleatorio)

// Hacer clic en el elemento con el ID 'inputBaseiconName'
WebUI.click(findTestObject('Especialidades/inputBaseiconName'))

// Hacer clic en el icono
WebUI.click(findTestObject('Especialidades/Icono'))

// Hacer clic en guardar
WebUI.click(findTestObject('Especialidades/Guardar'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Especialidades/Aceptar'))

// Click Ultima Pagina
WebUI.click(findTestObject('Especialidades/Ultima_Page'))

// Cambiar estado
WebUI.waitForElementVisible(findTestObject('Especialidades/Estado'), 10)

WebUI.waitForElementPresent(findTestObject('Especialidades/Estado'), 10)

WebUI.click(findTestObject('Especialidades/Estado'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Especialidades/Aceptar'))

// Editar la última especialidad creada
WebUI.waitForElementVisible(findTestObject('Especialidades/Editar'), 10)

WebUI.waitForElementPresent(findTestObject('Especialidades/Editar'), 10)

WebUI.click(findTestObject('Especialidades/Editar'))

terminoAleatorio = (terminosMedicos[random.nextInt(terminosMedicos.size())])

WebUI.setText(findTestObject('Especialidades/inputBasespecialtiesName'), terminoAleatorio)

// Click check nefro
WebUI.click(findTestObject('Especialidades/Check_Nefro'))

// Espera a que el elemento esté presente en la página
WebUI.waitForElementPresent(findTestObject('Especialidades/inputBasevaluesMin'), 5)

// Verifica si el elemento está habilitado y no es de solo lectura
def isElementEnabledAndEditable = WebUI.executeJavaScript('return document.getElementById(\'inputBasevaluesMin\') !== null && !document.getElementById(\'inputBasevaluesMin\').disabled && !document.getElementById(\'inputBasevaluesMin\').readOnly;', 
    null)

assert isElementEnabledAndEditable == true : 'El elemento no está habilitado o es de solo lectura'

// Espera a que el elemento sea visible
WebUI.waitForElementVisible(findTestObject('Especialidades/inputBasevaluesMin'), 5)

// Añade la clase 'ng-touched' al elemento
WebUI.executeJavaScript('document.getElementById(\'inputBasevaluesMin\').classList.add(\'ng-touched\');', null)

// Click en Valor bloqueante para agendar
WebUI.click(findTestObject('Especialidades/inputBasevaluesMin'))

// Escribe en Valor bloqueante para agendar
WebUI.setText(findTestObject('Especialidades/inputBasevaluesMin'), '1')

// Dispara el evento 'input'
WebUI.executeJavaScript('document.getElementById(\'inputBasevaluesMin\').dispatchEvent(new Event(\'input\'));', null)

// Dispara el evento 'change'
WebUI.executeJavaScript('document.getElementById(\'inputBasevaluesMin\').dispatchEvent(new Event(\'change\'));', null)

// Hacer clic en Valor intermedio para agendar
WebUI.click(findTestObject('Especialidades/inputBasevaluesInter1'))

// Escribir en Valor intermedio para agendar
WebUI.setText(findTestObject('Especialidades/inputBasevaluesInter1'), '2')

// Hacer clic en Valor intermedio para agendar
WebUI.click(findTestObject('Especialidades/inputBasevaluesInter2'))

// Escribir en Valor intermedio para agendar
WebUI.setText(findTestObject('Especialidades/inputBasevaluesInter2'), '3')

// Hacer clic en Valor viable
WebUI.click(findTestObject('Especialidades/inputBasevaluesMax'))

// Escribir en Valor viable
WebUI.setText(findTestObject('Especialidades/inputBasevaluesMax'), '4')

// Espera a que el elemento esté presente en la página
WebUI.waitForElementPresent(findTestObject('Especialidades/inputBasemaximumTime'), 5)

// Verifica si el elemento está habilitado y no es de solo lectura
def isElementEnabledAndEditable2 = WebUI.executeJavaScript('return document.getElementById(\'inputBasemaximumTime\') !== null && !document.getElementById(\'inputBasemaximumTime\').disabled && !document.getElementById(\'inputBasemaximumTime\').readOnly;', 
    null)

assert isElementEnabledAndEditable2 == true : 'El elemento no está habilitado o es de solo lectura'

// Espera a que el elemento sea visible
WebUI.waitForElementVisible(findTestObject('Especialidades/inputBasemaximumTime'), 5)

// Añade la clase 'ng-touched' al elemento
WebUI.executeJavaScript('document.getElementById(\'inputBasemaximumTime\').classList.add(\'ng-touched\');', null)

// Hacer clic en Tiempo particular
WebUI.click(findTestObject('Especialidades/inputBasemaximumTime'))

// Escribir en Tiempo particular
WebUI.setText(findTestObject('Especialidades/inputBasemaximumTime'), '5')

// Dispara el evento 'input'
WebUI.executeJavaScript('document.getElementById(\'inputBasemaximumTime\').dispatchEvent(new Event(\'input\'));', null)

// Dispara el evento 'change'
WebUI.executeJavaScript('document.getElementById(\'inputBasemaximumTime\').dispatchEvent(new Event(\'change\'));', null)

// Clic en el campo de observaciones
WebUI.click(findTestObject('Especialidades/inputBaseObservations'))

// Generar una observación aleatoria
def observaciones = ['Enfoque Multidisciplinario', 'Avances Tecnológicos', 'Especialización Creciente']

def observacionSeleccionada = observaciones[new Random().nextInt(observaciones.size())]

// Ingresar la observación en el campo
WebUI.setText(findTestObject('Especialidades/inputBaseObservations'), observacionSeleccionada)

// Click Guardar
WebUI.click(findTestObject('Especialidades/Guardar'))

// Click Aceptar
WebUI.click(findTestObject('Especialidades/Aceptar'))

// Click Ultima Pagina
WebUI.click(findTestObject('Especialidades/Ultima_Page'))

// Cambiar estado
WebUI.waitForElementVisible(findTestObject('Especialidades/Estado'), 10)

WebUI.waitForElementPresent(findTestObject('Especialidades/Estado'), 10)

WebUI.click(findTestObject('Especialidades/Estado'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Especialidades/Aceptar'))

// Editar la última categoría creada
WebUI.waitForElementVisible(findTestObject('Especialidades/Editar'), 10)

WebUI.waitForElementPresent(findTestObject('Especialidades/Editar'), 10)

WebUI.click(findTestObject('Especialidades/Editar'))

// Hacer clic en Cancelar
WebUI.click(findTestObject('Especialidades/Cancelar'))

// Click Ultima Pagina
WebUI.click(findTestObject('Especialidades/Ultima_Page'))

// Eliminar la última especialidad
WebUI.waitForElementVisible(findTestObject('Especialidades/Eliminar'), 10)

WebUI.waitForElementPresent(findTestObject('Especialidades/Eliminar'), 10)

WebUI.click(findTestObject('Especialidades/Eliminar'))

WebUI.click(findTestObject('Categoria/Aceptar'))

// Cerrar navegador
WebUI.closeBrowser()

