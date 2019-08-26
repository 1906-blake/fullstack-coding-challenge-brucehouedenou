import React from 'react';


import './App.css';

import { BrowserRouter, Switch, Route } from 'react-router-dom';

import { Nav } from './components/nav/nav.component';


const App: React.FC = () => {
  return (
    <div className="App">
      <BrowserRouter>
      <Nav />

        
    </BrowserRouter>
    </div>

  );
}

export default App;
