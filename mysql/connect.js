const mysql = require("mysql");

const connection = mysql.createConnection({
  host: "34.128.76.143",
  database: "testing",
  user: "root",
  password: "herbitional"
});

connection.connect(function (error) {
  if (error) {
    throw error;
  } else {
    console.log("MySQL Database is connected Successfully");
  }
});

module.exports = connection;

// const mysql = require("mysql");

// const dbConfig = {
//   host: "localhost",
//   user: "root",
//   password: "password",
//   database: "mydatabase",
// };

// const connection = mysql.createPool(dbConfig);

// module.exports = connection;
