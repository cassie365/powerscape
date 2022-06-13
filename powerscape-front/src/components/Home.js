import React from "react";
import { Outlet, Link } from "react-router-dom";
import './Home.css';
import AccountCard from "./AccountCard";

function Home() {
  return (
    <div className="Home">
      <header className="User-Screen">
        <h1 className="title">Welcome User</h1>
        <h2>Select an account to continue</h2>
        <div className="acc-container">
          <AccountCard accountName="MyskillerAccount" accountXP="1,234,567" />
          <AccountCard accountName="MyskillerAccount" accountXP="1,234,567" />
          <AccountCard accountName="MyskillerAccount" accountXP="1,234,567" />
        </div>
        <h2>GE Trends</h2>
        <p></p>

      </header>
    </div>
  );
}

export default Home;
