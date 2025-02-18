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
WebUI.navigateToUrl('https://agendamiento-frontend-c-demo-fmfqb3apb8egfnb5.eastus2-01.azurewebsites.net/login/ingreso')

// Esperar a que el botón de inicio de sesión esté presente y visible
WebUI.waitForElementPresent(findTestObject('Login/btnLogin'), 10)

WebUI.waitForElementVisible(findTestObject('Login/btnLogin'), 10)

// Hacer clic en el botón de inicio de sesión
WebUI.click(findTestObject('Login/btnLogin'))

// Ingresar el nombre de usuario
WebUI.setText(findTestObject('Login/input_usuario'), 'MiguelReyesDemo')

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
WebUI.mouseOver(findTestObject('Preparaciones/Menu'))

WebUI.mouseOver(findTestObject('Preparaciones/Menu'))

// Hacer clic en el icono de configuración
WebUI.click(findTestObject('Preparaciones/Menu'))

// Interacciones con el submenú
WebUI.mouseOver(findTestObject('Preparaciones/Menu'))

WebUI.mouseOver(findTestObject('Preparaciones/Menu'))

WebUI.mouseOver(findTestObject('Preparaciones/Menu'))

// Navegar a la sección de Parametrizacion
WebUI.click(findTestObject('Preparaciones/Parametrizacion'))

// Navegar a la sección de preparacion
WebUI.click(findTestObject('Preparaciones/Preparaciones'))

// Click Agregar
WebUI.click(findTestObject('Preparaciones/Agregar'))

// Seleccionar categoria
WebUI.click(findTestObject('Preparaciones/Selec_Categoria'))

WebUI.click(findTestObject('Preparaciones/Item_Categoria CE'))

// Seleccionar Especialidad
WebUI.click(findTestObject('Preparaciones/Select_Especialidad'))

WebUI.click(findTestObject('Preparaciones/Item_Especialidad'))

// Seleccionar Caracteristica
WebUI.click(findTestObject('Preparaciones/Selec_Caracteristica'))

WebUI.click(findTestObject('Preparaciones/Item_Caracteristicas'))

// Seleccionar Caracteristica
WebUI.click(findTestObject('Preparaciones/Select_Elementos'))

WebUI.waitForElementPresent(findTestObject('Preparaciones/Item_Elementos'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Item_Elementos'), 10)

WebUI.click(findTestObject('Preparaciones/Item_Elementos'))

// Generar un Observacion aleatorio
def terminosObser = ['Interdisciplinariedad y especialización', 'Personalización según necesidades clínicas', 'Desafíos en la interpretación']

// Seleccionar un término aleatorio
Random random = new Random()

def terminoAleatorio = terminosObser[random.nextInt(terminosObser.size())]

// Escribir el término aleatorio en el campo de texto con el ID 'inputBaseobservationsundefined'
WebUI.setText(findTestObject('Preparaciones/Observaciones'), terminoAleatorio)

// Generar una precondicion aleatorio
def terminosPreco = ['Evaluación clínica previa', 'Historial médico completo', 'Disponibilidad de equipo y personal capacitado']

// Seleccionar un término aleatorio
Random random2 = new Random()

def terminoAleatorio2 = terminosPreco[random2.nextInt(terminosPreco.size())]

// Escribir el término aleatorio en el campo de texto con el ID 'inputBasepreconditionsundefined'
WebUI.setText(findTestObject('Preparaciones/Precondicion'), terminoAleatorio2)

// Generar una precondicion aleatorio
def terminosIndic = ['Sospecha de patologías específicas', 'Seguimiento de tratamientos', 'Prevención y detección temprana']

// Seleccionar un término aleatorio
Random random3 = new Random()

def terminoAleatorio3 = terminosIndic[random3.nextInt(terminosIndic.size())]

// Click Indicaciones
WebUI.click(findTestObject('Preparaciones/Click_Indicaciones'))

// Escribir el término aleatorio en el campo de texto con el ID 'inputBaseindicationsundefined'
WebUI.setText(findTestObject('Preparaciones/Indicaciones'), terminoAleatorio3)

// Seleccionar Requisitos
WebUI.click(findTestObject('Preparaciones/Requisitos'))

// Sumar requisitos
WebUI.click(findTestObject('Preparaciones/Añadir_Requisito'))

// Generar un requisito aleatorio
def terminosReq = ['Consentimiento informado', 'Preparación física del paciente', 'Protocolos de seguridad', 'Calibración del equipo'
    , 'Documentación adecuada']

// Seleccionar un término aleatorio
Random random4 = new Random()

def terminoAleatorio4 = terminosReq[random4.nextInt(terminosReq.size())]

// Escribir el término aleatorio en el campo de texto del requisito
WebUI.waitForElementPresent(findTestObject('Preparaciones/Desc_Requis'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Desc_Requis'), 10)

WebUI.setText(findTestObject('Preparaciones/Desc_Requis'), terminoAleatorio4)

// Check Esencial
WebUI.waitForElementPresent(findTestObject('Preparaciones/Check_Requis'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Check_Requis'), 10)

WebUI.click(findTestObject('Preparaciones/Check_Requis'))

// Sumar requisitos
WebUI.click(findTestObject('Preparaciones/Añadir_Requisito'))

terminoAleatorio4 = (terminosReq[random4.nextInt(terminosReq.size())])

// Escribir el término aleatorio en el campo de texto del requisito
WebUI.waitForElementPresent(findTestObject('Preparaciones/Desc_Requis 2'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Desc_Requis 2'), 10)

WebUI.setText(findTestObject('Preparaciones/Desc_Requis 2'), terminoAleatorio4)

// Sumar requisitos
WebUI.click(findTestObject('Preparaciones/Añadir_Requisito'))

terminoAleatorio4 = (terminosReq[random4.nextInt(terminosReq.size())])

// Escribir el término aleatorio en el campo de texto del requisito
WebUI.waitForElementPresent(findTestObject('Preparaciones/Des_Requisito 3'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Des_Requisito 3'), 10)

WebUI.setText(findTestObject('Preparaciones/Des_Requisito 3'), terminoAleatorio4)

// Check Esencial
WebUI.waitForElementPresent(findTestObject('Preparaciones/Check_Requis 3'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Check_Requis 3'), 10)

WebUI.click(findTestObject('Preparaciones/Check_Requis 3'))

// Sumar requisitos
WebUI.click(findTestObject('Preparaciones/Añadir_Requisito'))

terminoAleatorio4 = (terminosReq[random4.nextInt(terminosReq.size())])

// Escribir el término aleatorio en el campo de texto del requisito
WebUI.waitForElementPresent(findTestObject('Preparaciones/Des_Requisito 4'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Des_Requisito 4'), 10)

WebUI.setText(findTestObject('Preparaciones/Des_Requisito 4'), terminoAleatorio4)

// Sumar requisitos
WebUI.click(findTestObject('Preparaciones/Añadir_Requisito'))

terminoAleatorio4 = (terminosReq[random4.nextInt(terminosReq.size())])

// Escribir el término aleatorio en el campo de texto del requisito
WebUI.waitForElementPresent(findTestObject('Preparaciones/Des_Requisito 5'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Des_Requisito 5'), 10)

WebUI.setText(findTestObject('Preparaciones/Des_Requisito 5'), terminoAleatorio4)

// Check Esencial
WebUI.waitForElementPresent(findTestObject('Preparaciones/Check_Requis 5'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Check_Requis 5'), 10)

WebUI.click(findTestObject('Preparaciones/Check_Requis 5'))

// Sumar requisitos
WebUI.click(findTestObject('Preparaciones/Añadir_Requisito'))

terminoAleatorio4 = (terminosReq[random4.nextInt(terminosReq.size())])

// Escribir el término aleatorio en el campo de texto del requisito
WebUI.waitForElementPresent(findTestObject('Preparaciones/Des_Requisito 6'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Des_Requisito 6'), 10)

WebUI.setText(findTestObject('Preparaciones/Des_Requisito 6'), terminoAleatorio4)

// click casilla para marcar requisito
WebUI.waitForElementPresent(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 2'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 2'), 10)

WebUI.click(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 2'))

// click casilla para marcar requisito
WebUI.waitForElementPresent(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 3'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 3'), 10)

WebUI.click(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 3'))

// click casilla para marcar requisito
WebUI.waitForElementPresent(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 4'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 4'), 10)

WebUI.click(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 4'))

// click casilla para marcar requisito
WebUI.waitForElementPresent(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 6'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 6'), 10)

WebUI.click(findTestObject('Preparaciones/Ambiente DEMO/Marca Requisito 6'))

// Sumar requisitos
WebUI.click(findTestObject('Preparaciones/Eliminar_Requisito'))

// Hacer clic en guardar
WebUI.click(findTestObject('Preparaciones/Guardar'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Preparaciones/Aceptar'))

// Click Ultima Pagina
WebUI.click(findTestObject('Preparaciones/Ultima_Page'))

// Ver niveles
WebUI.waitForElementVisible(findTestObject('Preparaciones/Niveles'), 10)

WebUI.waitForElementPresent(findTestObject('Preparaciones/Niveles'), 10)

WebUI.click(findTestObject('Preparaciones/Niveles'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Preparaciones/Aceptar'))

// Ver detalles
WebUI.waitForElementVisible(findTestObject('Preparaciones/Detalles'), 10)

WebUI.waitForElementPresent(findTestObject('Preparaciones/Detalles'), 10)

WebUI.click(findTestObject('Preparaciones/Detalles'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Preparaciones/Aceptar'))

// Cambiar estado
WebUI.waitForElementVisible(findTestObject('Preparaciones/Estado'), 10)

WebUI.waitForElementPresent(findTestObject('Preparaciones/Estado'), 10)

WebUI.click(findTestObject('Preparaciones/Estado'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Preparaciones/Aceptar'))

// Cambiar estado
WebUI.waitForElementVisible(findTestObject('Preparaciones/Estado'), 10)

WebUI.waitForElementPresent(findTestObject('Preparaciones/Estado'), 10)

WebUI.click(findTestObject('Preparaciones/Estado'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Preparaciones/Aceptar'))

// Click editar
WebUI.waitForElementVisible(findTestObject('Preparaciones/Editar'), 10)

WebUI.waitForElementPresent(findTestObject('Preparaciones/Editar'), 10)

WebUI.click(findTestObject('Preparaciones/Editar'))

// Seleccionar Requisitos
WebUI.click(findTestObject('Preparaciones/Requisito_Actualizar'))

terminoAleatorio4 = (terminosReq[random4.nextInt(terminosReq.size())])

// Escribir el término aleatorio en el campo de texto del requisito
WebUI.waitForElementPresent(findTestObject('Preparaciones/Desc_Requis 2'), 10)

WebUI.waitForElementVisible(findTestObject('Preparaciones/Desc_Requis 2'), 10)

WebUI.setText(findTestObject('Preparaciones/Desc_Requis 2'), terminoAleatorio4)

// Hacer clic en guardar
WebUI.click(findTestObject('Preparaciones/Guardar'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Preparaciones/Aceptar'))

// Click Ultima Pagina
WebUI.click(findTestObject('Preparaciones/Ultima_Page'))

// Ver niveles
WebUI.waitForElementVisible(findTestObject('Preparaciones/Niveles'), 10)

WebUI.waitForElementPresent(findTestObject('Preparaciones/Niveles'), 10)

WebUI.click(findTestObject('Preparaciones/Niveles'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Preparaciones/Aceptar'))

// Ver detalles
WebUI.waitForElementVisible(findTestObject('Preparaciones/Detalles'), 10)

WebUI.waitForElementPresent(findTestObject('Preparaciones/Detalles'), 10)

WebUI.click(findTestObject('Preparaciones/Detalles'))

// Hacer clic en aceptar
WebUI.click(findTestObject('Preparaciones/Aceptar'))

// Eliminar la último elemento
WebUI.waitForElementVisible(findTestObject('Preparaciones/Eliminar'), 10)

WebUI.waitForElementPresent(findTestObject('Preparaciones/Eliminar'), 10)

WebUI.click(findTestObject('Preparaciones/Eliminar'))

WebUI.click(findTestObject('Preparaciones/Aceptar'))

// Cerrar navegador
WebUI.closeBrowser()

