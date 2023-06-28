
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import Dashbord from './component/Dashbord';
import Student from './page/Student';
import Appointment from './page/Appointment';
import Addform from './page/Addform';
// import { useEffect, useState } from 'react';
// import appservice from './service/appservice';
// import dashford from './component/dashford';
function App() {


  return (
  
    <BrowserRouter>
      <Routes>
        <Route  path='/student' element={<Student/>}/>
        <Route path='/appointment' element={<Appointment/>}/>
        <Route path='/' element={<Dashbord/>}/>
        <Route path='/addform' element={<Addform/>}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;

