import React from 'react'

function Appointment() {
  return (
    <div>
      <h1>khamis</h1>
    </div>
  )
}

export default Appointment



// import { useEffect, useState } from "react";
// import { Link, useNavigate } from "react-router-dom";
// import Appservice from "../service/Appservice";
// import axios from "axios";


// // function Appointment(){
// //     const [appointment, setAppointment]= useState([]);
// //         const navigate=useNavigate();


// //         useEffect(()=>{
// //             fetchAppointment();
// //         }, []);


// //         const fetchAppointment=async()=>{
// //             const response=await Appservice.Getapp();
// //             setAppointment(response.data);
// //         }
// // //////////delete////////////
// //         function handledelete(Appointment_id){
// //             axios.delete(`http://localhost:8080/api/v1/appointment/delete/${Appointment_id}`).then(response =>{
// //                 alert("data are deleted now");
// //                 window.location.reload();
// //                 navigate("/")
// //             }).catch(Error=>console.log(Error));

// //             return(
// //                 <div>
// //                 <table>
// //                   <thead>
// //                     <tr>
// //                       <th>TIME</th>
// //                       <th>DATE</th>
// //                       <th>
// //                         Action
// //                       </th>
// //                     </tr>
// //                   </thead>
// //                   <tbody>
// //                     {appointment.length > 0 ? (
// //                       appointment.map((data, index) => (
// //                         <tr key={data.Appointment_id}>
// //                           <td>{data.time}</td>
// //                           <td>{data.date}</td>
// //                           <button onClick={e=> handledelete(data.Appointment_id) } className='btn btn-sm btn-denger ns-1 btn-secces'>Delete</button>
// //                         <Link to={"/Appointment Edit"}>Edit</Link>
          
          
          
                        
// //                         </tr>
// //                       ))
// //                     ) : (
// //                       <tr>
// //                         <td>data not found</td>
// //                       </tr>
// //                     )}
// //                   </tbody>
          
// //                 </table>
          
// //               </div>
// //            );
// //         }
// // }

// export default Appointment;