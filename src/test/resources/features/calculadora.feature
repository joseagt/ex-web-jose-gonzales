#language: es

Característica: Calculadora
  Yo, como usuario
  Quiero, tener una opción para realizar calculos
  Para ver todos los resultados

  @test
  Escenario: sumar dos numeros
    Dado que me encuentro en la página de basic Calculator
    Cuando ingrese los numeros primer numero: "5" y segundo numero: "15"
    Y selecciona la operacion: "Add"
    Y dar click en el boton "calculte"
    Entonces valido que debería aparecer el monto calculado "20"

  @test
  Escenario: resta dos numeros
    Dado que me encuentro en la página de basic Calculator
    Cuando ingrese los numeros primer numero: "20" y segundo numero: "5"
    Y selecciona la operacion: "Subtract"
    Y dar click en el boton "calculte"
    Entonces valido que debería aparecer el monto calculado "15"

  @test
  Escenario: multiplica dos numeros
    Dado que me encuentro en la página de basic Calculator
    Cuando ingrese los numeros primer numero: "20" y segundo numero: "5"
    Y selecciona la operacion: "Multiply"
    Y dar click en el boton "calculte"
    Entonces valido que debería aparecer el monto calculado "100"

  @test
  Escenario: divide dos numeros
    Dado que me encuentro en la página de basic Calculator
    Cuando ingrese los numeros primer numero: "20" y segundo numero: "5"
    Y selecciona la operacion: "Divide"
    Y dar click en el boton "calculte"
    Entonces valido que debería aparecer el monto calculado "4"

  @test
  Escenario: concatena dos numeros
    Dado que me encuentro en la página de basic Calculator
    Cuando ingrese los numeros primer numero: "20" y segundo numero: "5"
    Y selecciona la operacion: "Concatenate"
    Y dar click en el boton "calculte"
    Entonces valido que debería aparecer el monto calculado "205"
