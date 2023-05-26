const mysql = require("mysql");

const connection = mysql.createConnection({
  host: process.env.DB_HOSTNAME,
  database: process.env.DB_NAME,
  user: process.env.DB_USERNAME,
  password: process.env.DB_PASSWORD,
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
