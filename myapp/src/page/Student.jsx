import React, { useEffect, useState } from 'react';
import "./style.css";
//import App from '../App';
import appservice from '../service/Appservice';
import Appservice from '../service/Appservice';
import { Link, useNavigate } from 'react-router-dom';
import axios from 'axios';
import Addform from './Addform';

function Student() {
  const [student, setStudent] = useState([]);
  const navigate=useNavigate();

 
  useEffect(() => {
    fetchStudent();
  }, []);

  const fetchStudent=async()=>{
    const response=await Appservice.Getapp();
    setStudent(response.data);
  }
////////////////////delete///////////////

function handledelete(std_id){
  axios.delete(`http://localhost:8080/api/v1/student/delete/${std_id}`).then(response =>{
    alert("data are deleted");
    window.location.reload();
    navigate("/")
  }).catch(error=>console.log(error));
}

  return (
    <div>
      <table>
        <thead>
          <tr>
            <th>STUDENT NAME</th>
            <th>PROGRAM</th>
            <th>CAMPUS</th>
            <th>
              Action
            </th>
          </tr>
        </thead>
        <tbody>
          {student.length > 0 ? (
            student.map((data, index) => (
              <tr key={data.std_id}>
                <td>{data.std_name}</td>
                <td>{data.program}</td>
                <td>{data.campus}</td>
                <button onClick={e=> handledelete(data.std_id) } className='btn btn-sm btn-denger ns-1 btn-secces'>Delete</button>
              <Link to={"/Student Edit"}>Edit </Link>
              
              </tr> 
            ))
          ) : (
            <tr>
              <td>data not found</td>
            </tr>
          )}
        </tbody>


      </table>
      <Link to={"/Addform"}>Add</Link>

    </div>
  );
}

export default Student;
