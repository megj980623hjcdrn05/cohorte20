"use strict"
let num1=parseInt(prompt("1"))
let num2=parseInt(prompt("2"))
let num3=parseInt(prompt("3"))

if ((num1>=num2)&&(num1>=num3)) {
    if (num2>num3) {
        console.log(num1+" "+num2+" "+num3);
        console.log(num3+" "+num2+" "+num1);
    } else {
        console.log(num1+" "+num3+" "+num2);
        console.log(num2+" "+num3+" "+num1);
    }
}else if ((num2>=num1)&&(num2>=num3)) {
    if (num1>num3) {
        console.log(num2+" "+num1+" "+num3);
        console.log(num3+" "+num1+" "+num2);         
    } else {
        console.log(num2+" "+num3+" "+num1);
        console.log(num1+" "+num3+" "+num2);
        
    }
}else if ((num3>=num1)&&(num3>=num2)) {
    if (num1>num2) {
        console.log(num2+" "+num3+" "+num1);
        console.log(num1+" "+num3+" "+num2);
    }else{
        console.log(num3+" "+num2+" "+num1);
        console.log(num1+" "+num2+" "+num3);
    }
}   