import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

// Abrir navegador y maximizar
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
WebUI.mouseOver(findTestObject('Categoria/Menu'))

WebUI.mouseOver(findTestObject('Categoria/Menu'))

// Hacer clic en el icono de configuración
WebUI.click(findTestObject('Categoria/Menu'))

// Interacciones con el submenú
WebUI.mouseOver(findTestObject('Categoria/Menu'))

WebUI.mouseOver(findTestObject('Categoria/Menu'))

WebUI.mouseOver(findTestObject('Categoria/Menu'))

// Navegar a la sección de Parametrizacion
WebUI.click(findTestObject('Categoria/Parametrizacion'))

// Navegar a la sección de Categorías
WebUI.click(findTestObject('Categoria/Categorias'))

// Crear nueva categoría
WebUI.click(findTestObject('Categoria/Agregar'))

// Generar datos aleatorios (Groovy)
Random rand = new Random()

def terminosMedicos = ['Radiografía de tórax', 'Tomografía computarizada', 'Resonancia magnética', 'Ultrasonido abdominal'
    , 'Mamografía', 'Angiografía', 'Densitometría ósea', 'Ecocardiograma', 'Gammagrafía ósea', 'PET scan']

def terminoAleatorio = terminosMedicos[rand.nextInt(terminosMedicos.size())]

WebUI.setText(findTestObject('Categoria/Nombre_Categoria'), terminoAleatorio)

def descripciones = ['Técnicas de Imagen Estructural', 'Técnicas de Imagen Funcional', 'Técnicas de Imagen No Invasivas y Dinámicas']

def descAleatoria = descripciones[rand.nextInt(descripciones.size())]

WebUI.setText(findTestObject('Categoria/Descripcion'), descAleatoria)

// Guardar la nueva categoría
WebUI.click(findTestObject('Categoria/Requiere_Elemento'))

// Guardar la nueva categoría
WebUI.click(findTestObject('Categoria/Guardar'))

// Click Aceptar
WebUI.click(findTestObject('Categoria/Aceptar'))

// Click Ultima Pagina
WebUI.click(findTestObject('Categoria/Ultima_Page'))

// Editar estado
WebUI.waitForElementVisible(findTestObject('Categoria/Estado'), 10)

WebUI.waitForElementPresent(findTestObject('Categoria/Estado'), 10)

WebUI.click(findTestObject('Categoria/Estado'))

WebUI.click(findTestObject('Categoria/Aceptar'))

// Ver la descripcion de la última categoría creada
WebUI.waitForElementVisible(findTestObject('Categoria/Check_Descrip'), 10)

WebUI.waitForElementPresent(findTestObject('Categoria/Check_Descrip'), 10)

WebUI.click(findTestObject('Categoria/Check_Descrip'))

WebUI.click(findTestObject('Categoria/Aceptar'))

// Editar la última categoría creada
WebUI.waitForElementVisible(findTestObject('Categoria/Editar'), 10)

WebUI.waitForElementPresent(findTestObject('Categoria/Editar'), 10)

WebUI.click(findTestObject('Categoria/Editar'))

terminoAleatorio = (terminosMedicos[rand.nextInt(terminosMedicos.size())])

WebUI.setText(findTestObject('Categoria/Nombre_Categoria'), terminoAleatorio)

WebUI.click(findTestObject('Categoria/Guardar'))

// Click Aceptar
WebUI.click(findTestObject('Categoria/Aceptar'))

// Click Ultima Pagina
WebUI.click(findTestObject('Categoria/Ultima_Page'))

// Eliminar la última categoría
WebUI.waitForElementVisible(findTestObject('Categoria/Eliminar'), 10)

WebUI.click(findTestObject('Categoria/Eliminar'))

WebUI.click(findTestObject('Categoria/Aceptar'))

// Cerrar navegador
WebUI.closeBrowser()

