import './App.css';
import { Routes, Route, Link } from "react-router-dom";

import Layout from "./pages/Layout";
import Home from "./pages/Home";
import NoPage from "./pages/NoPage";
import ViewAccount from "./pages/ViewAccount";


function App() {
  return (
    <div className='App'>
      <h1>Testing</h1>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Home />} />
          <Route path="viewaccount" element={<ViewAccount />} />
          <Route path="*" element={<NoPage />} />
        </Route>
      </Routes>
    </div>
  );
}

export default App;
