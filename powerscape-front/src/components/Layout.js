import { Outlet, Link } from "react-router-dom";
import { Logo } from "../images/logo.svg";

function Layout() {
  return (
    <>
      <nav className="navbar">
        <img className="logo" src="{Logo}"/>
        <h1>PoweRScape</h1>
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
        </ul>
      </nav>

      <Outlet />
    </>
  )
};

export default Layout;