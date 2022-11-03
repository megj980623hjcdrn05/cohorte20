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
    [5, 9, ],
    []
];

let ma2 = [
    [5],
    [8],
    [1]
];

for (let fila = 0; fila <= 2; fila++) {
    for (let columna = 0; columna <= 2; columna++) {
        resultado = ma1[fila] * ma2[columna];
        console.log(resultado);
        
    }
    console.log("-------------");
}
