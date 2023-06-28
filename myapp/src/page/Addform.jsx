import axios from 'axios';
import React, { useState } from 'react'


function Addform() {
    const [name,setName]= useState([]);
    const[program,setProgram]= useState([]);
    const[campus,setCampus]= useState([]);

    const handleSubmit=(Event)=>{
        Event.preventDefault();
        const mydata={
            std_name:name,
            program:program,
            campus:campus

        };
        axios.post("http://localhost:8080/api/v1/student/save",mydata);
    }

  return (
    <div>
      <form onSubmit={handleSubmit}>
      <label for="name">Name:</label>
		<input value={name}onChange={Event=>setName(Event.target.value)} type="text" id="name" name="name" required></input><br></br>


		<label for="address">Program:</label>
		<input value={program}onChange={Event=>setProgram(Event.target.value)} type="text" id="pgram" name="program" requirnamed></input><br></br>

		<label for="name">Campus:</label>
		<input value={campus}onChange={Event=>setCampus(Event.target.value)} type="text" id="name" name="name" required></input><br></br>

	
		<button type="submit">Submit</button>
      
      </form>
    </div>
  )
}

export default Addform;
