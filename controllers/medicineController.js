const dotenv = require("dotenv");
const jwt = require("jsonwebtoken");
dotenv.config();

exports.getMed = async (req, res, next) => {
  return res.status(201).json({
    status: "Success",
    requestAt: new Date().toISOString(),
    message: "Hai",
  });

  // let db = `
  // SELECT * FROM artikel
  // WHERE tag = "${tag}"
  // `;

  // connection.query(db, function (err, data) {
  //   if (data.length > 0) {
  //   } else {
  //     return res.status(404).json({
  //       status: "Failed",
  //       requestAt: new Date().toISOString(),
  //       message: "Not Found",
  //     });
  //   }
  //   return res.status(201).json({
  //     status: "Success",
  //     judul: data.judul,
  //     tag: data.tag,
  //     artikel: data.artikel,
  //     requestAt: new Date().toISOString(),
  //   });
  // });
};

exports.home = async (req, res) => {
  return res.status(201).json({
    status: "Success",
    requestAt: new Date().toISOString(),
    message: "Hai",
  });
};
