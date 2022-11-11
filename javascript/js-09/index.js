console.log("Hola mundo desde node.js");

const parrotSay = require('parrotsay-api')
 
parrotSay('yaaay')
  .then(console.log)
  .catch(console.error)