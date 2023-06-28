import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import Appservice from "../service/Appservice";
import axios from "axios";

function Doctor(){
    const [doctor, setDoctor]=useState([]);
    const navigate=useNavigate();


    useEffect(()=>{
        fetchDoctor();
    },[]);

    const fetchDoctor=async()=>{
        const response=await Appservice.Getapp();
        setDoctor(response.data);
    }

    function handledelete(Dct_id){
        axios.delete(`http://localhost:8080/api/v1/specilization/delete/${ct_id}`).then(response=>{
            alert("data are deleted");
            window.location.reload();
            navigate("/")

        }).catch(Error=>console.log(Error));
    }


    return(
        <div>
            <table>
                <thead>
                    <tr>
                        <th>DOCTOR NAME</th>
                        <th>DOCTOR EMAIL</th>
                        <th>DOCTOR PHONE</th>
                        <th>
                            Action
                        </th>
                    </tr>
                </thead>
                <tbody>
                    {doctor.length>0?(
                        doctor.map((data, index)=>(
                            <tr key={data.Dct_id}>
                                <td>{data.}</td>
                            </tr>
                        ))
                    )}
                </tbody>
            </table>
        </div>
    )
}