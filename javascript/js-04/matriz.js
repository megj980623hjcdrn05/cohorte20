/* let arr = [

    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

/* for (let fila = 0; fila <= 2; fila++) {
    for (let columna = 0; columna <= 2; columna++) {
        console.log(arr[fila][columna]);
        
    }
    console.log("-------------");
} */

// let cont = 0;
/* while (cont < 10) {
    cont += 1;
    console.log(cont);
}
*/
/* do {
   console.log(cont);
   cont ++;
} while (cont <= 10); */
/* let fila = 0;
while (fila < 3) {
        for (let columna = 0; columna <= 2; columna++) {
            console.log(arr[fila][columna]);
            
        }
        fila++;
        console.log("-------------");
}  */

let ma1 = [
    [2, 5, 6],
    [5, 9, 7],
    [6, 4, 3]
];

let ma2 = [
    [5, 3, 2],
    [8, 5, 4],
    [1, 4, 9]
];

let mar = [[],[],[]];

for (let fila = 0; fila <= 2; fila++) {
    for (let columna = 0; columna <= 2; columna++) {
         mar[fila][columna] = ma1[fila][columna] * ma2[columna][fila];       
        
    }
}
console.log(mar);