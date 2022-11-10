//forma 1
//1 llamar al contenedor
const imagen = document.getElementsByClassName('contenedor')[0];

//2 - crear elemento

const nuevaimg = document.createElement("img");
 // Modificar atributos

 nuevaimg.src = "https://placeimg.com/200/200/nature";
 nuevaimg.alt = "Imagen de naturaleza";

 //4 - insertar el elemento

imagen.appendChild(nuevaimg);


//Forma 2
//llamar al elemento padre
// const imagen2 = document.getElementById('img');

// //2 
// imagen2.innerHTML = `
//     <img src ="https://placeimg.com/200/200/tech" alt="Imagen de tech"/>
// `;

document.getElementById('img').innerHTML = `
<img src ="https://placeimg.com/200/200/tech" alt="Imagen de tech"/>
`;

//crear una lista a partir de los elementos guardados en un arreglo
// insertarla en el documento para que se pueda mostrar

const nombres = ["Pedro", "Juan", "Sonia", "Miguel"];
//forma1
document.getElementById('lista1');
nombres.forEach((el) => { const li = document.createElement('li');
li.textContent = el;
lista1.appendChild(li);
});

//forma2

const lista2 = document.getElementById('lista2');
nombres.forEach((el) => {
    lista2.innerHTML += `
        <li>${el}</li>
    `;
});

