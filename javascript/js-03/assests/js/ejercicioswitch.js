/* Escribir un programa que detecte el cupón que tiene el usuario
Bronce se le hará un descuento del 5 %
Plata se le hará un descuento del 10%
Oro se le hará un descuento del 20%
Platino se le hará el descuento del 25%
-El usuario introduce el precio primero y después el cupón
-El programa debe mostrar el precio original y el precio con el descuento aplicado
-También debe mostrar el mensaje "El cupón no es válido" en caso de que sea un 
 cupón equivocado
 */
/* let precio = Number(prompt('Escribe el precio'));
let cupon = prompt('Escribe tu cupon');
let precioFinal;
let des;
// cupon = cupon.toLowerCase();

switch (cupon) {
    case 'Bronce':
        des = preciofinall(.05);
      break;
    case 'Plata':
        precioFinal = precio * 0.10;
      break;
    case 'Oro':
        precioFinal = precio * 0.20;
      break;
    case 'Platino':
        precioFinal = precio * 0.25;
      break;
    default:
      alert('El cupón no es válido');
      break;
}
const preciofinall = (descuento) => precio - (precio * descuento);
document.write("El precio original es: " + precio + "<br>" + " El precio con descuento es: " + des); */

// `` - literal strings - plantillas literales 
let nombre = 'juan';
console.log(`hola yo soy ${nombre} y mi edad es ${2022-1998}`);

//operador ternario
/* if simplificado  */
let edad = 18;

let mensaje = edad === 18 
  ? 'es mayor de edad' 
  : 'Tas chiquito';

  console.log(mensaje);

  console.log(`Yo soy juan y soy ${edad >= 19 ? 'soy mayor de edad' : 'soy menor de edad'}`);