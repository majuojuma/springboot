import React from 'react'
import './Dashbord.css'
import { Link } from 'react-router-dom';
function Dashbord() {
  return (
    <div>
      <h1>welcome to our application</h1>
      <Link to={'/addform'}><button>Student list</button></Link>
      
    </div>
  )
}

export default Dashbord;
// import React from 'react'
// import './Dashbord.css'
// import { Link } from 'react-router-dom'
// import Student from '../page/Student'

// function Dashbord() {
//   return (
//     <div>
//       <header>
//   <h2>HEALTH APPOINTMENT SYSTEM ON SUZA</h2>
// </header>

// <section>
//   <nav>
//     <ul>
//       <li><Link to={Student}>STUDENT</Link></li>
//       <li> <Link to={Dashbord}>Dashbord</Link></li> 
//     {/* //  <li><a href="#">APPOINTMENT</a></li> */}
//     </ul>
//   </nav>
  
//   <article>
//     <h1>london</h1>
//     <p>London is the capital city of England. It is the most populous city in the  United Kingdom, with a metropolitan area of over 13 million inhabitants.</p>
//     <p>Standing on the River Thames, London has been a major settlement for two millennia, its history going back to its founding by the Romans, who named it Londinium.</p>
//   </article>
// </section>

// <footer>
//   <p>Footer</p>
// </footer>
//     </div>
//   )
// }

// export default Dashbord

