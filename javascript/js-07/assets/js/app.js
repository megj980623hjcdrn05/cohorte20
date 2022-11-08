const titulo = document.getElementById('titulo');
const parrafos = document.getElementsByClassName('parrafo');
titulo.textContent = 'hola'
parrafos[0].innerHTML = 'soy un parrafo'
console.log(titulo.textContent);
console.log(parrafos[1].textContent);

// parrafos[1].style.color = 'red';
// parrafos[1].style.backgroundColor = 'white';

console.log(parrafos[1].classList.add('coloresFeos'));

//crear elementos html
const padre = document.getElementById('padre');
const enlace = document.createElement("a");
enlace.href = 'https://www.google.com';
enlace.innerHTML = "Ir a google";
document.body.appendChild(enlace);
document.body.insertAdjacentElement("beforeend", enlace);
padre.appendChild(enlace);
console.log(enlace);