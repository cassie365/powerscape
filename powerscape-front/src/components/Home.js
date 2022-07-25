import React, { useEffect, useState } from "react";
import { Outlet, Link } from "react-router-dom";
import AccountCard from "./AccountCard";

export default function Home() {
  const [accounts, setAccounts] = useState([])

  const result = () => {
    fetch('http://localhost:8080/api/v1/accounts')
    .then((response) => response.json())
    .then((data) => {
      setAccounts(data)
    })
  }

  useEffect(() => {
    result()
  }, [])

  const allAccount = accounts.map(account => {
    return(
      <AccountCard accountId={account.id} accountName={account.username} accountXP="1111111"/>
    )
  })

  return (
    <div className="main">
      <header className="User-Screen">
        <h1 className="title">Welcome User</h1>
        <h2>Select an account to continue</h2>
        <Link to="/addaccount">Add Account</Link>
        <div className="acc-container">
          {allAccount}
        </div>
        <h2>GE Trends</h2>
        <p></p>

      </header>
    </div>
  )
}