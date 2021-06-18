#language: en

Feature: Deseo realizar registro en la pagina web

  Scenario: Realizare el registro de un usuario en la pagina web
   Given Cuando Santiago este en la plataforma ire a registrarme
   When estemos en el modulo 1 ingresaremos los siguientes valores
    | firstName | lastName | email                 | day | month   | year | languages | | city     | postalCode  | country  | | mobileDevice | model            | operatingSystem | | password     | confirmPassword |
    | Lina      | Maria    | linamaria@yopmail.com | 07  | 12      | 1991 | spanish   | | Medellin |  150001     | Colombia | | Xioami       | Redmi Note 6 Pro | Android 10      | | Arsenal5840. | Arsenal5840.    |
    Then Debera ver el mensaje 'Welcome to the world's largest community of freelance software testers!'
