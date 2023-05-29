const express = require("express");
const passport = require("passport");
const router = express.Router();
const medicineController = require("../controllers/medicineController");
const jwtAuth = require("../middleware/jwtAuth");

router.get("/getmed", jwtAuth(), medicineController.getMed);
router.get("/home", jwtAuth(), medicineController.home);

module.exports = router;
