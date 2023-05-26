const dotenv = require("dotenv");
const jwt = require("jsonwebtoken");
dotenv.config();

const jwtAuth = () => {
  return async (req, res, next) => {
    const authorization = req.headers.authorization;
    const token = authorization.split(" ")[1];

    if (!token) {
      return res.status(401).json({ error: "Unauthorized" });
    }

    jwt.verify(token, process.env.JWT_SECRET, (err, decoded) => {
      if (err) {
        return res.status(401).json({ error: "Invalid token" });
      }
      req.jwt = decoded;
      next();
    });
  };
};

module.exports = jwtAuth;
