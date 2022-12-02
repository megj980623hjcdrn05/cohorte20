// Escribe tu código aquí.
//1starts
//let string = "bocina";

const array = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio', 'uno', 'dos', 'tres', 'cuatro'];
const arrayFiltrado = [];

function filtro (string, array) {
    array.forEach(element => {
        if (element.length > string.length  ) {
            arrayFiltrado.push(element);
        }
    });
    return arrayFiltrado;
}

//console.log(filtro(string, array));

//1ends

//2starts

function imprimirListaEnDom(arrayaFiltrado) {
    arrayFiltrado.forEach(element => {
        const getul = document.getElementsByTagName('ul');
        const newli = document.createElement("li");
        //insertar elementos del array a los li
        newli.textContent = element;
        //anadir los elementos al html
        getul[0].appendChild(newli); 
    });
} 

//imprimirListaEnDom(arrayFiltrado);

//2ends

//3bonus starts

const boton = document.createElement('button');
boton.textContent = "iniciar";
document.body.appendChild(boton);

boton.addEventListener('click' , function () {
    let string = prompt('inserta una palabra');
    filtro (string, array);
    imprimirListaEnDom(arrayFiltrado);
});






