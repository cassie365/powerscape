import React from "react";
import { Outlet, Link } from "react-router-dom";
import './Home.css';

function Home() {
  return (
    <div className="Home">
      <header className="User-Screen">
        <h1 className="title">Welcome User</h1>
        <h2>Select an account to continue</h2>
        <div className="acc-container">
          <Link className="acc-box" to="/viewaccount">
              <h2>AccountMain123</h2>
              <p>1,234,567</p>
          </Link>
        </div>
        <h2>GE Trends</h2>
        <p></p>

      </header>
    </div>
  );
}

export default Home;
