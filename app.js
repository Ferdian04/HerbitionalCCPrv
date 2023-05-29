require("dotenv").config();

const cors = require("cors");
const express = require("express");
const authRoutes = require("./routes/authRoute");
const medicineRouter = require("./routes/medicineRouter");
const app = express();
const bodyParser = require("body-parser");
const connection = require("../mysql/connect");

app.use(cors({ origin: "*" }));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

app.use("/api/v1/auth", authRoutes);
app.use("/api/v1/medicine", medicineRouter);

app.get("/", function (req, res) {
  res.send(`Hello World ${process.env.JWT_SECRET}`);
});

console.log(process.env.JWT_SECRET);

const server = app.listen(8080, function () {
  const port = server.address().port;

  console.log("Example app listening at http://localhost:%s", port);
});


db = `
  SELECT * FROM user_login`;
    connection.query(db, function (err, data) {
      console.log(data.length);
}
};
