class dataBaseDriver{

    constructor(driver) {
      this.driver= driver;
    }


    async exec_question(request){
        const session = this.driver.session()
        try {
            const result = await session.run(request)
            result.records.forEach(element => {
                console.log("element",element.get(0))
            });
            return result.records
        }
        finally {
            await session.close()
        }
    }

}
module.exports = dataBaseDriver
