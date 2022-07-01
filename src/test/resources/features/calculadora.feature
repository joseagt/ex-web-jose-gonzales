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
