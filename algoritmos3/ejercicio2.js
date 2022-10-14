"use strict"
//room6
const personas = ["Maria", "Dani", "Luis", "Juan", "Camila"];
//Escribe un comando para remover a "Dani" del arreglo
//splice();
personas.splice(1, 1)
console.log(personas);
//Escribe un comando para remover a "Juan del arreglo"
personas.splice(2, 1)
console.log(personas);
//Escribe un comando para agregar a "Luis" al inicio del arreglo
//personas.splice(0, 0, "Luis")
personas.unshift("Luis")
console.log(personas);
//Escribe el comando para agregar tu nombre al final del arreglo
personas.push("Rodrigo")
console.log(personas);
//Escribe el comando para mostrar la posición de "Maria"
//indexOf()
console.log(personas.indexOf("Maria")); 
//Escribe el comando para mostrar la posición de tu nombre
console.log(personas.indexOf("Rodrigo"));
//personas.splice(personas.indexOf("Rodrigo"), 1)
//console.log(personas);