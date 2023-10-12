import React, { Component }  from 'react';
import EmployeeServices from '../services/EmployeeServices';

class ListEmployeeComponent extends Component {
    constructor(props){
        super(props)
        this.state = {
            employees: []
        }
    }

    componentDidMount(){

        EmployeeServices.getEmployee().then((res) =>{
            console.log(res.data,"...")
            this.setState({employees : res.data});
           
        });
       
        
    }
   

    render() {
        return (
            <div>
                <h2 className = "text-center">Employee Information</h2>
                <div className = "row">
                    <table className = "table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th> Employee ID</th>
                                <th> Employee Name</th>
                                <th> Employee Age</th>
                                <th> Employee Salary</th>
                                <th>Actions</th>
                                

                            </tr>
                        </thead>
                     
                        <tbody>
                         {
                         this.state.employees.map(
                            (employee) =>
                                <tr key = {employee.emp_Id}>{employee.emp_Id}
                                <td>{employee.emp_Name}</td>
                                <td>{employee.emp_Age}</td>
                                <td>{employee.emp_Salary}</td>
                                </tr>      
                         )
                         }
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default ListEmployeeComponent;