const numeros = [2, 4, 6, 57, 200];
let suma = 0;
// for each
// recorre todo el arreglo y ejecuta el codigo que le indiquemos sobre los valores guardados
numeros.forEach(elemento => console.log(elemento * elemento));
// numeros.forEach(function sumar(elemento) {
//     console.log(elemento * elemento );
// });
/* let suma2 = numeros.forEach(function sumar(elemento) {
    suma += elemento;
    console.log(suma);
}); */

numeros.forEach(elemento => suma += elemento);
console.log(suma);

numeros.forEach((el, indice, arreglo) => {
    console.log(el, indice, arreglo);
});

/* map
genera una copia del array original */
let newarray = numeros.map((el, idx, arr) => {
    return el * el;
});

console.log(newarray);

/* filter 
crea un copia del array original y nos permite filtrar */

const frutas = ['papaya', 'manzaba', 'manzana', "uva"];
let frutafiltrada = frutas.filter((fruta) => fruta.length > 3);

    console.log(frutafiltrada);