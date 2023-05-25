const passport = require("passport");
const passportJWT = require("passport-jwt");
const JwtStrategy = passportJWT.Strategy;
const ExtractJwt = passportJWT.ExtractJwt;

const jwtOptions = {
  jwtFromRequest: ExtractJwt.fromAuthHeaderAsBearerToken(),
  secretOrKey: process.env.JWT_SECRET,
};

const jwtStrategy = new JwtStrategy(jwtOptions, (payload, done) => {
  pool.getConnection((err, connection) => {
    if (err) {
      console.error("Error acquiring database connection: ", err);
      return done(err, false);
    }

    const query = "SELECT * FROM users WHERE id = ?";
    connection.query(query, [payload.userId], (error, results) => {
      connection.release();

      if (error) {
        console.error("Error executing query: ", error);
        return done(error, false);
      }

      if (results.length > 0) {
        const user = results[0];
        return done(null, user);
      } else {
        return done(null, false);
      }
    });
  });
});

passport.use(jwtStrategy);
