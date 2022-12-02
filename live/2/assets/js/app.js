const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
//nombre de variables mas especificos
const $n = document.querySelector('.name');
//.name
const $b = document.querySelector('.blog');
//no hay id
const $l = document.querySelector('.location');
//no hay tag con class location
//funcion async
async function displayUser(username) {
  $n.textContent = 'cargando...';
  const response = await fetch(`${usersEndpoint}/${username}`);
  console.log(data);
  $n.textContent = '${data.name}';
  $b.textContent = '${data.blog}';
  $l.textContent = '${data.location}';
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  n.textContent = `Algo salió mal: ${err}`;
  //;al final
}

displayUser('stolinski').catch(handleError);