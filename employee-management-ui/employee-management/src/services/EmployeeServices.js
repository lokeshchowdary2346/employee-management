import axios from "axios";

const EMPLOYEE_API_BASE_URL="http://localhost:8081/getEmployee";
class EmployeeServices{

async getEmployee(){
    const data=await axios.get(EMPLOYEE_API_BASE_URL);
    console.log(data);
    return data
}

}

export default new EmployeeServices()