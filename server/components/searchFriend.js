const dataBaseDriver = require("./dataBaseDriver.js")

class searchFriends {

    constructor(driver) {
      this.db = new dataBaseDriver(driver)
    }

    async search(searchString){

      const words = searchString.split(' ');
      let result = [];
      console.log("worlds:", words)
      words.forEach(async s => {
        let  prom = await this.db.exec_question("MATCH (m:Person) WHERE m.name CONTAINS '"+s +"' OR m.lastname CONTAINS '"+s +"' RETURN m")
        console.log("prom:",prom)
        result.push(prom)
      });
      console.log("result: ",result)
      return result;
    }
}

module.exports = searchFriends
