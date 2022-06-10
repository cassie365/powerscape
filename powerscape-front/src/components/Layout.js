import { Outlet, Link } from "react-router-dom";

function Layout() {
  return (
    <>
      <nav className="navbar">
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