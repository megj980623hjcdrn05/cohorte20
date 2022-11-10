// const foo = () => console.log("First");
// const bar = () => setTimeout(() => console.log("Second"), 500);
// const baz = () => console.log("Third");

// bar();
// foo();
// baz();

//servidor
// const nombre = () => {
//     const nombres = ["pepe", "Pancho", "Maria"];
// //     setTimeout(() => {
// //         return nombres;
// //     }, 3000);


// // }
// //servidor

// // console.log(nombre()[0]);

// const url = 'https://pokeapi.co/api/v2/pokemon/6';
// const pokedex = () => 
//     fetch(url)
//         .then(datos => datos.json())
//         .then(pokemon => console.log(pokemon))
//         .catch(error => console.log(error))

// pokedex();

// //servidor
// const nombre = () => {
//     const nombres = ["Pepe", "Pancho", "María"];

//     /* setTimeout(() => {
//         return nombres;
//     }, 0); */

//     return new Promise((resolve, reject) => { //resolve -- proceso exitoso
//         setTimeout(() => {    
//             if (false){
//                 resolve(nombres);
//             } else{
//                 reject("no hay nombres");
//             }                //reject -- proceso no exitoso
         
//         }, 1)
//     });

// }
//servidor

/*
nuestra pc
*/
// console.log(nombre()[0]);

// nombre().then(nombres => console.log(nombres)).catch(error => console.warn(error));

//azucar sintactica
//codigo que se creo para facilitar el trabajo de los programadores

//async -- await
/*  asyn function obtenerNombre (){

}
 */

const obtnerNombre = async () => {
    try {
        let nombres = 
        await nombre();  
        console.log(nombres);
    } catch (error) {
        console.warn(error);
    }

};

// obtnerNombre();
const cartaPokemon = document.getElementById('pokemon');
const nombrepokemon = document.getElementById('nombre');
const imagen = document.getElementById('img');

const pokedex2 = async (num) => {
    try {
        const respuesta = await (await fetch(`https://pokeapi.co/api/v2/pokemon/${num}`));
        const pokemon = await respuesta.json();

        const datos = {
            nombre: pokemon.name,
            imagen: pokemon.sprites.other['official-artwork'].front_default,
        };

        imagen.innerHTML = `<img src="${datos.imagen}" alt="" />`;
        nombrepokemon.textContent = datos.nombre;
    } catch (error) {
        
    }
}



form.addEventListener('submit', (event) => {
    //codigo
    event.preventDefault();
   const valor = document.getElementById('idP').value;
   pokedex2(valor);
   form.reset();
})