//objeto literal
let persona = {
    nombre: 'juan',
    apellido: 'perez',
    nombrecompleto: function () {return `el nombre es ${this.nombre} ${this.apellido}`}
}

for (nombrePropiedad in persona) {
   console.log(nombrePropiedad);
   console.log('valor: ' + persona[nombrePropiedad]);
}

console.log(persona);
console.log(persona.nombre);
console.log(persona.nombrecompleto());
console.log(persona['apellido']);
persona.tel = '546643643634634';
console.log(persona);
delete persona.tel;
console.log(persona);
let personaArreglo = Object.values(persona);


//objeto de instancia
let person1 = new Object();
person1.edad = 23;
//console.log(person1);
//console.log(person1.edad);

let constructor 