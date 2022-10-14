"use strict"
//var miVariable= prompt("Cual es tu nombre: ")

//function saludoPer(){
//   alert(miVariable)
//}
function suma(){
    //let num1=parseInt(prompt("de el valor de numero 1: "))
    //let num2=parseInt(prompt("de el valor de numero 2: ")) 
    let num1=5
    let num2=6
    let resultado=num1+num2;
    return resultado
}
//saludoPer(miVariable)
//alert (suma())

function res(){
    
    let num1 =5
    let num2 =6
    let resultado=num1-num2;
    return resultado
}

function mul(){
    
    let num1=5
    let num2=6
    let resultado=num1*num2;
    return resultado
}

function div(){
    
    let num1=5
    let num2=1
    if(num2!=0){
        return num1/num2
    }
    alert('el denominador es 0')
} 

function modulo(){
    let num1=5
    let num2=6
    let resultado=num1%num2;
    return resultado
}

function incremento(){
    let num1=7
    num1++
    return num1
}

function adicionales(){
    let num1=5
    let resultado
}

function logic(){
    let valid=5
    let valid2=5
        if(valid>=valid2){
            console.log(valid2);
    }
    //console.log(valid);
}
//logic()

function edad(){
    let miEdad=18
    if(miEdad>=18){
        console.log("eres mayor de edad");
    } else {
    console.log("no eres mayor de edad");
    }
}
//edad()
function conjuncion(){
    let valor1=false
    let valor2=true
    if(valor1&&valor2){
        console.log("el valor 1 y el valor 2 son verdaderos");
    }else{
        console.log("un valor es falso");
    }
}
//conjuncion()
function disyuncion(){
    let valor1=false
    let valor2=true
    if(valor1||valor2){
        console.log("un valor es true");
    }else{
        console.log("ningun valor es true");
    }
}
//disyuncion()
function negacion(){
    let valor1=true
    if (!(!valor1)){
        console.log("el valor es "+valor1);
    }else{
        console.log("el valor negado es "+valor1);
    }
}
negacion()
/*  console.log(suma());
console.log(res());
console.log(mul());
console.log(div());
console.log(modulo());*/