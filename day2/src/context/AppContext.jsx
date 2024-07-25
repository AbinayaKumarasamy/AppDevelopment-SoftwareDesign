import React, {createContext, useState } from 'react'
const GlobalContext=createContext();
function AppContext({children}) {
    const[name,setName]=useState("Abi")
  return (
    <GlobalContext.Provider value={{name,setName}}>
{children}
    </GlobalContext.Provider>
  )
}

export default AppContext