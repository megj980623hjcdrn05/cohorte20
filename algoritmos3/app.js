"use strict"
var arr1= new Array("juan",1,true)
console.log(arr1);
console.log(arr1[1]);
console.log(arr1[3]);
arr1[3]=234
console.log(arr1[3]);
arr1[10]=5
console.log(arr1);
arr1[10]="gdl"
console.log(arr1);

var arr2=[]
console.log(arr2);
arr2[0]=2
console.log(arr2);

const arr3=[]
console.log(arr3);
arr3[4]="hola"
console.log(arr3);

const suma=()=>{
}
//arreglos multidimensionales
const arr4=[1,"adios", false, [2]]
console.log(arr4[2]);
console.log(arr4[3][0]);