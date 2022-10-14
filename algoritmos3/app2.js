"use strict"
//propiedades de arreglos
//length
const frutas=["🍐", "Manzana", "guayaba", 'Platano']
console.log(frutas);
console.log(frutas.length);

//metodos - acciones
//push -agrega al final 
var num=frutas.push('sandia', 'limon')
console.log(frutas);
console.log(num);
//unshift -agrega al inicio
var num2=frutas.unshift('guanabana')
console.log(frutas);
console.log(num2);

//metodos para quitar 
//pop() quita al final un elemento y regresar ese elemento

var elemento=frutas.pop()
console.log(frutas);
console.log(elemento);

//shifht
var elemento2=frutas.shift()
console.log(frutas);
console.log(elemento2);

//indexof()
console.log(frutas.indexOf('Manzana')); 
console.log(frutas.indexOf('Platano')); 
//reverse()
console.log(frutas.reverse());
//frutas[4].reverse()
//console.log(frutas);
//sort()
frutas.sort()
console.log(frutas);

const numbers=[4, 567, 2, 4566, 45, 78, 1]
numbers.sort((a, b) => a - b) //funcion callback
//numbers.sort(function order(a,b){return a-b})
console.log(numbers);