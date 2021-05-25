var USER = "project"
var PASSWORD = "1234"

var express=require('express');
const exphbs = require('express-handlebars');
const cookieParser = require('cookie-parser');
const bodyParser = require('body-parser');

var app=express();
//db connection
const neo4j = require('neo4j-driver');

const driver = neo4j.driver("bolt://localhost:7687", neo4j.auth.basic(USER,PASSWORD));

// To support URL-encoded bodies
app.use(bodyParser.urlencoded({ extended: true }));

// To parse cookies from the HTTP Request
app.use(cookieParser());

require('./router/main')(app,driver);

app.engine('hbs', exphbs({
    extname: '.hbs'
}));

app.set('view engine', 'hbs');

var server=app.listen(3000,() =>console.log("Express is running on port 3000"));
