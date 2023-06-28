import axios from "axios"

const myapi ="http://localhost:8080/api/v1/student/list"
const api="http://localhost:8080/api/v1/appointment/list"

class Appservice{
    Getapp(){
        return axios.get(myapi);
    
    }
    Getapp(){
        return axios.get(api);
    }
}
export default new Appservice ();

