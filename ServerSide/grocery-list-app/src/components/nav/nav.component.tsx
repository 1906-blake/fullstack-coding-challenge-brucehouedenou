import React from 'react';
import { Link } from 'react-router-dom';
export class Nav extends React.Component {
   render() {
       return (
           <nav className="navbar navbar-expand-lg navbar-light bg-light">
               <Link to="/" className="navbar-brand">Grocery List</Link>
               <div className="navbar-nav">
                   <Link to="/grocery-list" className="nav-item nav-link active">Grocery</Link>
                   <Link to="/grocery-item" className="nav-item nav-link">List</Link>
               </div>
           </nav>
       )
   }
}