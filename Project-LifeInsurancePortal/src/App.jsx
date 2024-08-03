import React,{useState} from 'react'
import {BrowserRouter,Route,Routes,Link} from 'react-router-dom'
import Login from './components/Login'
import Header from './components/Header'
import Footer from './components/Footer'
import Register from './components/Register'
import { UserProvider } from './context/UserContext';
import Display from './pages/Display'
import HomePage from './components/HomePage'
import About from './components/About'
import Service from './components/Service'
import TermLifeInsurance from './components/TermLifeInsurance'
import WholeLifeInsurance from './components/WholeLifeInsurance'
import UniversalLifeInsurance from './components/UniversalLifeInsurance'
import HealthInsurance from './components/HealthInsurance'
import GlobalCoverage from './components/GlobalCoverage'
import InvestmentPlans from './components/InvestmentPlans'
function App() {
  return (
    <div>
      <UserProvider>
      <BrowserRouter>
      <Routes>
        <Route path='/' element={<Login />} />
        <Route path='/Display' element={<Display/>}/>
        <Route path='/HomePage' element={<HomePage/>}/>
        <Route path='/Register' element={<Register/>}/>
        <Route path='/Header' element={<Header />} />
        <Route path='/Footer' element={<Footer />} />
        <Route path='/About' element={<About />} />
        <Route path='/Service' element={<Service />} />
        <Route path="/TermLifeInsurance" element={<TermLifeInsurance />} />
        <Route path="/WholeLifeInsurance" element={<WholeLifeInsurance />} />
        <Route path="/UniversalLifeInsurance" element={<UniversalLifeInsurance />} />
        <Route path="/HealthInsurance" element={<HealthInsurance />} />
        <Route path="/GlobalCoverage" element={<GlobalCoverage />} />
        <Route path="/InvestmentPlans" element={<InvestmentPlans />} />
      </Routes>
      </BrowserRouter>
      </UserProvider>
    </div>
  )
}

export default App