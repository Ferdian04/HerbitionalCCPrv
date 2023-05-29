const connection = require("../mysql/connect");

exports.getMed = async (req, res) => {
  console.log("Cari .....");
  let { tag } = req.body;

  let db = `
SELECT * FROM tabel_artikel WHERE tag LIKE "%${tag}%"
  `;

  connection.query(db, function (err, data) {
    if (data.length <= 0) {
      return res.status(404).json({
        status: "Failed",
        requestAt: new Date().toISOString(),
        message: "Not Found",
      });
    }
    return res.status(201).json({
      status: "Success",
      artikel: data,
      requestAt: new Date().toISOString(),
    });
  });
};

exports.home = async (req, res) => {
  return res.status(201).json({
    status: "Success",
    requestAt: new Date().toISOString(),
    message: "Ini home",
  });
};
