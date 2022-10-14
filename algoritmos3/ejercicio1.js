"use strict"
//room5
const arr = [1,2,5,8,["Alberto", "pedro", "Manuel"], true, false, [["Manzana", "Pera", "Uva", "Naranja", ["Limón", -234, -5]],["Papa", "Calabaza", "Aguacate"],[255, 512, 1024]]];
console.log(arr);
//1  "Alberto"
console.log(arr[4][0]);
//2  "Papa"
console.log(arr[7][1][0]);
//3  "Manuel"
console.log(arr[4][2]);
//4  -5
console.log(arr[7][0][4][2]);
//5  "Pera"
console.log(arr[7][0][1]);
//6  "Limón"
console.log(arr[7][0][4][0]);
//7  false
console.log(arr[6]);
//8  512
console.log(arr[7][2][1]);
//9  "Calabaza"
console.log(arr[7][1][1]);
//10  255
console.log(arr[7][2][0]);
