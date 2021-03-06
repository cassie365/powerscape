import './App.css';
import { Routes, Route, Link } from "react-router-dom";

import Layout from "./components/Layout";
import Home from "./components/Home";
import NoPage from "./components/NoPage";
import ViewAccount from "./components/ViewAccount";
import AddAccount from './components/AddAccount';

export default function App() {
  return (
    <div className='App'>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Home />} />
          <Route path="viewaccount" element={<ViewAccount />} />
          <Route path="addaccount" element={<AddAccount />}/>
          <Route path="*" element={<NoPage />} />
        </Route>
      </Routes>
    </div>
  );
}
