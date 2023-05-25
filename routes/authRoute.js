const express = require("express");
const router = express.Router();
const connection = require("../mysql/connect");
const bcrypt = require("bcrypt");
const jwt = require("jsonwebtoken");
const authController = require("../controllers/authController");

router.use((req, res, next) => {
  console.log("Time: ", Date.now());
  next();
});

router.post("/register", authController.signup);
router.post("/login", authController.signin);
router.get("/protected", authController.protected);

module.exports = router;
