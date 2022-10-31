let myName = 'juanito';
        console.log(myName);

function miFuncion (){
    let nombre = 'juan';
    console.log(nombre);
}
miFuncion();

function function1(valor){
    valor += 3;
    return console.log(valor); 
}

function1(2);

let myFunction = (a) => a + 3;
console.log(myFunction(2));

let varGlobal = 5;
function function3(varLocal){
    console.log(varLocal + varGlobal);
}
function3('el valor es: ')

function function4(num, valor){
    num *= valor;
    return num;
}
console.log('el producto es ' + function4(6, 2));

let fun = function (para){
para *= 2;
return para;
}
console.log('llamando a la funcion anonima ' + fun(4));

let funarray = (para) => para * 2;
console.log(funarray(4));

const function6 = (caracteres) => 'hola' + caracteres;
console.log('el resultado es: ' + function6(' lunes ')); 

const suma = (x, y) => {return x + y};
console.log('la suma es: ' + suma(5,3));
/* Realizar una funcion (calcularPrecioTotal)
para Calcular el precio total de una compra tomando encuenta 
impuestos = 1.16, gartos de envio = 10, y como parametro el precio
donde 
precioTotal = (precio * impuesto ) + gartosEnvio;

como salida precio Total
precioTotal = calcularPrecioTotal(23.34);
 */

const calcularPrecioTotal = (precio, impuesto = 1.16, gartosEnvio = 10) => precio * impuesto + gartosEnvio;
console.log(calcularPrecioTotal(23.34));
/* Para que el ejemplo anterior sea más completo, se puede añadir otro argumento a la función que indique el porcentaje de impuestos que se debe añadir al precio del producto. Evidentemente, el nuevo argumento se debe añadir tanto a la definición de la función como a su llamada:let precioConImpuestos = (1 + porcentajeImpuestos/100) * precio;
calculaPrecioTotal(precio, porcentajeImpuestos)*/

const calcularPrecioTotal2 = (precio, porcentajeImpuestos, gartosEnvio = 10) => precio * (1 + porcentajeImpuestos/100) + gartosEnvio;
console.log(calcularPrecioTotal2(23.34, 16));

let miObjeto = {
    nombre: 'juan',
    edad: 33,
}

console.log(miObjeto.nombre);
console.log(miObjeto['edad']);