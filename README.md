📋 README - Gestor de Usuarios con Diálogo

¡Bienvenido/a al proyecto Gestor de Usuarios! 🎉 Esta aplicación Java con interfaz gráfica (Swing) permite gestionar usuarios a través de una ventana principal y un diálogo modal para confirmar o cancelar acciones. A continuación, encontrarás una descripción del proyecto, los componentes utilizados, y cómo ejecutarlo. 🚀

📖 Descripción General

Este proyecto consta de dos clases principales:





Tarea.java: Una ventana principal (JFrame) que actúa como un gestor de usuarios, con formularios, pestañas y opciones de navegación. 🖥️



Dialogo.java: Un diálogo modal (JDialog) para confirmar o cancelar acciones, con soporte para cierre mediante tecla ESC o la cruz de la ventana. 🛑

La aplicación está diseñada con Java Swing, ideal para interfaces gráficas ligeras y funcionales. Es perfecta para gestionar información de usuarios de forma interactiva. 😄

🛠️ Componentes Utilizados

Clase Tarea (Ventana Principal - Gestor de Usuarios)







Componente



Descripción



Propiedades





JPanel



Contenedores para organizar la interfaz (navegación, logotipo, contenido). 🗂️



PanelPrincipal (contenedor raíz), navpanel (navegación), logopanel (logo).





JButton



Botones para navegar y realizar acciones en el formulario. 🖱️



Botones de navegación (dashboardButton, usuariosButton, etc.) y formulario (guardarButton, cancelarButton, limpiarButton).





JTextField



Campos de texto para entrada de datos (por ejemplo, nombre, ID). ✍️



textField1, textField2, textField3 para datos del usuario.





JComboBox



Lista desplegable para seleccionar opciones (por ejemplo, roles). 📋



comboBox1 para opciones predefinidas.





JCheckBox



Casilla para marcar estados (por ejemplo, usuario activo/inactivo). ✅



activoCheckBox para estado booleano.





JTabbedPane



Pestañas para organizar vistas (por ejemplo, lista o edición de usuarios). 📑



tabbedPane1, tabbedPane2 para múltiples secciones.





JFrame



Ventana principal de la aplicación. 🪟



Configurado con setContentPane, EXIT_ON_CLOSE, pack(), setVisible.

Clase Dialogo (Diálogo Modal)







Componente



Descripción



Propiedades





JDialog



Ventana modal para confirmar o cancelar acciones. 🔔



setModal(true), setDefaultCloseOperation(DO_NOTHING_ON_CLOSE), botón predeterminado (buttonOK).





JPanel



Contenedor principal del diálogo. 🗂️



contentPane con acción de tecla ESC (registerKeyboardAction).





JButton



Botones para aceptar o cancelar. 🆗🛑



buttonOK (ejecuta onOK()), buttonCancel (ejecuta onCancel()).





WindowAdapter



Maneja el evento de cierre de la ventana (cruz). 🔲



Ejecuta onCancel() al cerrar la ventana.





KeyStroke/ActionListener



Atajo de teclado para cerrar el diálogo con ESC. ⌨️



Asocia KeyEvent.VK_ESCAPE con onCancel().

🚀 Cómo Ejecutar





Requisitos:





Java Development Kit (JDK) instalado (versión 8 o superior). ☕



Un IDE como IntelliJ, Eclipse o NetBeans (o compilar desde la terminal). 🖥️



Pasos:





Clonar o descargar el proyecto: Asegúrate de tener los archivos Tarea.java y Dialogo.java. 📂



Compilar:





Desde un IDE, importa el proyecto y ejecuta la clase Tarea o Dialogo directamente.



Desde la terminal:

javac Tarea.java Dialogo.java
java Tarea

o

java Dialogo



Interacción:





La clase Tarea abrirá una ventana con un formulario para gestionar usuarios. 🖱️



La clase Dialogo abrirá un diálogo modal con botones "OK" y "Cancel". ✅❌



Notas:





Es probable que el diseño de la interfaz en Tarea dependa de un archivo de diseño generado por un GUI Builder (como NetBeans). Asegúrate de incluir esos archivos si los usas. 🛠️



El diálogo (Dialogo) es independiente y puede integrarse con Tarea para confirmar acciones como guardar o eliminar usuarios. 🔗

📝 Notas Adicionales





Integración: Actualmente, no hay un enlace explícito entre Tarea y Dialogo. Puedes integrar el diálogo para que aparezca al hacer clic en botones como guardarButton o cancelarButton en Tarea. 🔄



Mejoras:





Agregar ActionListener a los botones de Tarea para implementar funcionalidades específicas. 🛠️



Personalizar los nombres de los componentes (textField1, etc.) para mayor claridad. 📛



Añadir validaciones a los campos de entrada en Tarea. ✅



Estilo: Los nombres genéricos de los componentes sugieren que Tarea fue creada con un diseñador gráfico. Considera renombrarlos para mejorar la mantenibilidad. ✍️

🌟 Contribuciones

¡Siéntete libre de contribuir! Puedes:





Añadir nuevas funcionalidades al gestor de usuarios. 🆕



Mejorar el diseño de la interfaz con estilos o iconos. 🎨



Reportar problemas o sugerencias abriendo un issue. 🐛

¡Gracias por usar este proyecto! 🎉 Si tienes dudas, no dudes en preguntar. 😊
