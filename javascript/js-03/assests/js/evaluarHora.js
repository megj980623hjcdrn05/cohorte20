/* pedir la hora por promt
evaluar la hora y responder
Buenos dias 6 - 11
Buenas tardes 12 - 18
Buenas noches 19 - 23
Dejame dormir 0 - 5
 */

// let hora = Number(prompt('Escribe la hora '));
// if (hora <= 5 && hora >= 0) {
//     document.write('Dejame dormir');
// }else if(hora <= 11 && hora >= 6) {
//     document.write('Buenos dias');
// }else if(hora <= 18 && hora >= 12) {
//     document.write('Buenas tardes');
// }else if(hora <= 23 && hora >= 19) { 
//     document.write('Buenas noches');
// }else{
//     document.write('Nan');
// }

/* Muestre el dia de la semana*/
let dia = 1;

if (dia === 1) {
    document.write('Lunes')
} else if(dia === 2) {
    document.write('Martes')
}else if(dia === 3) {
    document.write('Miercoles')
}else if(dia === 4) {
    document.write('Jueves')
}else if(dia === 5) {
    document.write('Viernes')
}else if(dia === 6) {
    document.write('Sabado')   
}else if(dia === 7) {
    document.write('Domingo')
}     

