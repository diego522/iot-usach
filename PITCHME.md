#IoT
### Diego Sepúlveda
---
##¿Qué es exactamente el IoT?

_"... la interconexión de cualquier producto con cualquier otro a su alrededor ..."_

Note:
- Con el pasar del tiempo, la capacidad de poder capturar información desde distintos dispositivos se ha incrementado drásticamente.
- Múltiples fuentes de información emitiendo contenidos para su análisis.

---
##IoT, el Origen
Bill Joy imaginó la comunicación D2D (del inglés: Device to Device, dispositivo a dispositivo), como parte de su estructura de las "Seis Webs" (en 1999 en el Foro Económico Mundial de Davos ); pero no fue hasta la llegada de Kevin Ashton que la industria tomó un segundo vistazo a la utilidad del internet de las cosas.

Note:
Bill, cofounder of Sun: Considerado uno de los mejores programadores de la historia, (escribío el nucleo de BSD en un fin de semana), con fundador de Sun Microsystem,. describió que la comunicacion máquina a máquina sería parte de una de las 6 webs. Las 6 web’s son:
- La internet que puedes ver en una pantalla,
- La internet que siempre llevas contigo
- La internet que puedes apreciar en la pantalla grande
- La internet extraña, aquella que es capaz percibir instrucciones mediante la voz y puedes oír.
- B2B: la internet que permite a las máquinas de negocios interactuar entre ellas,
- D2D: la internet que permite a las dispositivos comunicarse entre sí.

Kevin, RFDI inventor y cofundador del Auto-ID Lab (centro de investigación en el MIT): Inventor del concepto “Internet de las cosas”, que describe un sistema donde el internet esta conectado al mundo físico mediante sensores ubicuos.
Desarrolladores de la arquitectura del IoT auspiciados por empresas como  HP, Walmart.

---
##Incidencias
- Impacto Social <!-- .element: class="fragment" -->
- Cambio económico <!-- .element: class="fragment" -->
- Evolución <!-- .element: class="fragment" -->

Note:
- Las personas ven como sus vidas se facilitan, y medios digitales les entregan con mayor detalle información que necesitan o no.
- Posibilidad de nuevos negocios
- Reducción de costos
- Dependencia de los aparatos

---
##Aspectos del software/hardware involucrados

- Machine learning
- Real Time Analytics
- Sensores
- Embedded Systems

Note:
La gran cantidad de información circulante debe ser procesada de manera adecuada y sacar el máximo provecho.

Evolución en la calidad y versatilidad del hardware
Mejores técnicas para transmisión y almacenamiento de los datos
Creación de herramientas capaces de analizar y generar conocimiento a partir de los datos almacenados.


---
##Aplicaciones Actuales
- Media <!-- .element: class="fragment" -->
- Monitoreo del entorno <!-- .element: class="fragment" -->
- Administración de infraestructuras <!-- .element: class="fragment" -->
- Manufacturación de productos <!-- .element: class="fragment" -->
- Agricultura <!-- .element: class="fragment" -->
- Administración de la energía <!-- .element: class="fragment" -->
- Medicina <!-- .element: class="fragment" -->
- Domótica <!-- .element: class="fragment" -->
- Transporte <!-- .element: class="fragment" -->
- ... <!-- .element: class="fragment" -->

Note:
Usos del IoT:
- Media:
  - Transmisiones y cámaras de control remoto
- Monitoreo del entorno
  - Calidad del aire
- Admin. de Infra.:
  - Inventarios
- Manufacturacion
  - Automatización de ensamblajes
- Agricultura
  - Monitoreo de invernaderos
- Medicina
  - Telemedicina
- Domótica
  - Automatización de la iluminación
- Transporte
  - Monitoreo de buses

---
##Addressing & Auto-ID Center
- Auto-ID Center: centro de investigación y desarrollo en el MIT quienes desarrollaron el protocolo RFID (radio frequency identification)
- Cada objeto capaz de conectarse a la red debe poseer un identificador único, que lo distinga de otro, a pesar que posean características similares.
- Inconvenientes con el direccionamiento de los dispositivos, el protocolo IPv4 es limitado.

Note:
Centro: auspiciado por Wal-Mart, HP, Gillette, entre otros
Crearon el “electronic product code”
---
##Internet 0
Hace referencia a una capa física encargada solamente de la asignación de direcciones IP a cualquier cosa, de baja velocidad y económica.
En el internet 0, los mensajes RFID se transforman en datos físicos, capaces de ser capturados/enviados directamente por dispositivos ubicuos y procesar la información que contienen para la toma de decisiones.
---
##Computación Ubicua
Se refiere a cómo la computación (el software) se integra con el entorno de las personas.
- Ej: Personas consultando indicaciones a un panel de información en el Mall.

Note:
También conocido como inteligencia ambiental, es parte del IoT, incluso también puede ser parte de la inteligencia artificial.

Desde el punto de vista técnico la computación ubicua contempla una gran cantidad de conceptos:
- Computación distribuida
- Redes móviles
- Sensores
---
##Características del IoT
- Inteligencia:
  - Los participantes podr+an actuar de forma independiente (perseguir objetivos propios) y tomar decisiones de acuerdo al ambiente.
- Arquitectura:
  - Arquitectura dirigida a eventos
Caótico y complejo
  - Una gran cantidad de actores participando del proceso de compartir sus datos y que requieren atención.

Note:
- Inteligencia:
No determinista: no está necesariamente ligado al concepto de causa efecto, no todas las acciones necesariamente deben concluir en algo concreto
- Arquitectura:
	Toda la infraestructura, software y hardware debe estar pensada en el comportamiento y en la recepción de eventos del ambiente.
---
##Características del IoT
- Tiempo:
  - El tiempo ya no puede ser considerado ni tratado como una unidad lineal, muchos eventos paralelos y simultáneos.
- Seguridad:
  - Toda la información circulante debe estar protegida.
---
#Internet of Things
##Protocolos de Mensajería
---
##Better QoS
- Better Quality of Service:
  - Verificar cada envió de los datos
  - Basado en mensaje - respuesta (algunas veces comprobación)
---
##Message Persistence
- Message Persistence
  - Almacenamiento permanente de los mensajes
---
##Patrones de mensajería
![PROTOCOLOS](assets/protocolos.png)
---
##Telemetry
Implementación del patrón de dos modos:
- Como cliente: Envía peticiones PUT/POST para actualizar el estado del dispositivo.
- Como servidor: Recibe peticiones GET consultando por información.
En cualquier caso todo se trata de peticiones y respuestas. Se basa en el concepto de “Publicador/Suscriptor”, además se basa en el QoS.
---
##Inquiry
El dispositivo envía peticiones GET al servidor para obtener información.
---
##Command
Basado en la arquitectura de cliente/servidor, el servidor envía instrucciones al dispositivo esperando resultados.
---
##Notification
Similar a Command y Telemetry, el servidor envía notificaciones, o instrucciones, pero este no queda a la espera de respuestas.
---
##El IoT
El internet de las cosas no es más que mensajería, la cual está previamente definida por los patrones. Bajo la arquitectura de cliente/servidor, publicador/suscriptor, petición/respuesta o cualquier otra, los protocolos proveen diferentes maneras de trabajo, nativas o no.
---
##Consideraciones claves
Sensores
- Sistema operativo para IoT
- Abstracción del hardware
- Soporte de comunicación
- Administración remota
---
##Consideraciones claves
Conecciones y “Smartthings”
- Sistema operativo para el sistema base
- Containers y/o ambientes en tiempo real
- Comunicación y conectividad
- Administración de datos y mensajería
- Administración remota
---
## Consideraciones claves
IoT en la nube
- Conectividad y enrutamiento de los mensajes
- Administración y registro de los dispositivos
- Administración y almacenamiento de los datos
- Administración de eventos, Analítica y UI
- Disponibilización de las aplicaciones
---
## Consideraciones claves
Transversales
- Seguridad
- Descripción de los mensajes, datos y “Data interoperability ”
- Herramientas de desarrollo
---
## Consideraciones claves
Características relevantes que debe cumplir un stack de IoT
- Bajo acoplamiento
- Modular
- Independiente de plataforma
- Basado en estándares abiertos
- Apis de comunicación bien definidas

---
# IoT
## Micro servicios
---
## Arquitectura de microservicios
- Construcción de una aplicación en pequeños pedazos
- Normalmente se refiere a una comunicación via protocolo HTTP
- Cada parte resuelve un requerimiento del negocio
---
## Características de una SOA
- Los componentes son servicios
- Organizada en torno a las funcionalidades del negocio
- Productos no proyectos
- Tener gobierno descentralizado
- Gestión de datos descentralizada
- Diseño pensado en las fallas
- Automatización de la infraestructura
- Diseño evolutivo
---

## Actividad de clase
Dado el siguiente problema:
  - Matrículas de alumnos de la universidad.

  - Diseñar un diagrama de componentes, con los elementos que la arquitectura de microservicios que deberían existir.
    - Responsabilidades de cada uno
    - Entradas y salidas
_(incluir bases de datos que deberían existir)_
---
## Servicios
- ¿Qué tipo de Servicios Web Existen?
  - ¿Qué protocolos para WS exiten?
  - Verbos HTTP, que función cumplen y el objetivo de cada uno?

---
## Referencia
https://martinfowler.com/articles/microservices.html

---
## Lectura
http://www.oreilly.com/iot/free/what-is-the-internet-of-things.csp

---
## REST
- Estilo de arquitectura que se basa en la presentación de estados.
- Usando principalmente para el HTTP.
- Más sencillo de definir que otros (Por Ejemplo SOAP).
- Operaciones bien definidas (mediante los verbos HTTP).
- Sintáxis universalmente conocida.

---
## Recursos en REST
Cualquier elemento que pueda proveer información.
 - Ejemplo:  <!-- .element: class="fragment" -->
   - Recurso:  <!-- .element: class="fragment" -->
     - Personas  <!-- .element: class="fragment" -->
     - Cuenta bancaria  <!-- .element: class="fragment" -->
   - No recurso:  <!-- .element: class="fragment" -->
     - Enviar un mail  <!-- .element: class="fragment" -->
     - Actualizar un estado  <!-- .element: class="fragment" -->
     - Notificar  <!-- .element: class="fragment" -->

---
## RPC v/s REST
- RPC: Llamadas a procedimiento remoto
- REST: basado en la obtención de información en base a los recursos

---
## Rest no es sinónimo de JSON
---

## Formatos de entrada/salida
- JSON  <!-- .element: class="fragment" -->
- XML  <!-- .element: class="fragment" -->
- Plain Text  <!-- .element: class="fragment" -->
- ...  <!-- .element: class="fragment" -->
---

## Endpoints

- uno
- dos
  - uno dos
    - tres

Puntos de acceso a los recursos/acciones
- Request:<!-- .element: class="fragment" -->
  - Path Variables <!-- .element: class="fragment" -->
  - Request Params <!-- .element: class="fragment" -->
  - Headers <!-- .element: class="fragment" -->
  - Request Body <!-- .element: class="fragment" -->
- Responses: <!-- .element: class="fragment" -->
  - HTTP Status <!-- .element: class="fragment" -->
  - Headers <!-- .element: class="fragment" -->
  - Response Body <!-- .element: class="fragment" -->
---

## Request
- URL: _http://myServer:Port/myApp/users?sort=age_
- HEADER
  - Content-type: application/json
---

## Response
```
[
  {
    "name":"Alex",
    "phone":"123"
  },
  {
    "name":...
  },
  ...
]
```
---
## Ejemplo
Microservicio mantenedor de personas, operaciones CRUD

| **Method** |           **URL**           |         **Descripción**         |
| ---------- | --------------------------- | ------------------------------- |
| GET        | http://localhost/personas   | Obtiene a todas las personas    |
| GET        | http://localhost/personas/1 | Obtiene a la persona con id 1   |


---

| **Method** |           **URL**           |         **Descripción**         |
| ---------- | --------------------------- | ------------------------------- |
| PUT/PATCH  | http://localhost/personas/1 | Actualiza a la persona con id 1 |
| DELETE     | http://localhost/personas/1 | Elimina a la persona con id 1   |

---

| **Method** |          **URL**          |     **Descripción**      |
| ---------- | ------------------------- | ------------------------ |
| POST       | http://localhost/personas | Crea a una nueva persona |
|            |                           |                          |

---

# Stack tecnológico
---

## Instalar para la próxima clase
- JDK 8 (ojalá version Oracle)
  - Incluir variable de Entorno JAVA_HOME y PATH
- Apache Maven 3.x
  - Incluir variables PATH, M2, M2_HOME
- Entorno de desarrollo favorito para Java :)
- Cliente Rest
  - Postman
  - curl
  - etc.

---

## Kit Arduino
https://www.seeedstudio.com/Grove-Starter-Kit-for-Arduino-p-1855.html
---

# Introucción a Spring Framework
---

## Spring Framework

Framework, open source, para desarrollar aplicaciones basado en la inversion de control y la inyección de dependencias. Nace en el año 2002 como un sustituto a EJB.
---

## Principales características
- Adopción de características de J2EE. <!-- .element: class="fragment" -->
- Programación orientada a aspectos. <!-- .element: class="fragment" -->
- Modelo de 'N' capas. <!-- .element: class="fragment" -->
- Inyección de dependencias. <!-- .element: class="fragment" -->

---

## Módulos existentes dentro del proyecto Spring (1)

- Spring Framework <!-- .element: class="fragment" -->
- Spring Boot <!-- .element: class="fragment" -->
- Spring Cloud <!-- .element: class="fragment" -->
- Spring Data <!-- .element: class="fragment" -->
- Spring Integration <!-- .element: class="fragment" -->
- Spring Batch <!-- .element: class="fragment" -->
- Spring Security <!-- .element: class="fragment" -->

---
## Módulos existentes dentro del proyecto Spring (2)

- Spring Cloud Data Flow <!-- .element: class="fragment" -->
- Spring HATEOAS <!-- .element: class="fragment" -->
- Spring Social <!-- .element: class="fragment" -->
- Spring for Android <!-- .element: class="fragment" -->
- Spring WebServices <!-- .element: class="fragment" -->
- Spring StateMachine <!-- .element: class="fragment" -->
- Spring Shell <!-- .element: class="fragment" -->
- ... <!-- .element: class="fragment" -->

---
## Configuración en base a anotaciones y properties
La configuración de la aplicación puede ser ingresada mediante archivos especiales de configuration llamados, "Properties", pueden estar en formato property o yaml.
La ejecución de las configuraciones puede ser setada mediante archivos XML, o en sus más recientes versiones, mediante anotaciones que facilitan la codificación y crean un código más limpio.

---

## Orientación a aspectos
Intervención de las llamadas a los procedimientos

---

## El contexto de Spring
Los beans viven dentro del conexto de spring, el cual los gestiona dependiendo de su scope. Aquí interviene el IoC y la Inyección de Dependencias. Ésto es el corazon del framework.
---

## Patrones de Diseño más importantes reconocidos dentro de Spring
- Singleton
- Prototype
- Proxy
---

## Principio S.O.L.I.D
| Inicial |                 Concepto                 |
| ------- | ---------------------------------------- |
| S       | Principio de responsabilidad única       |
| O       | Principio de abierto/cerrado             |
| L       | Principio de sustitución de Liskov       |
| I       | Principio de segregación de la interfaz  |
| D       | Principio de inversión de la dependencia |

---
