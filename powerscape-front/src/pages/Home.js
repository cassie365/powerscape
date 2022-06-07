import './Home.css';

function Home() {
  return (
    <div className="Home">
      <header className="User-Screen">
        <h1>Welcome User</h1>
        <h2>Select an account to continue</h2>
        <div className="Acc-container">
          <div className="Acc-box">
            <h2>Account Name</h2>
            <p>Total XP: 1,234,567</p>
          </div>
          <div className="Acc-box">
            <h2>Account Name</h2>
            <p>Total XP: 1,234,567</p>
          </div>
          <div className="Acc-box">
            <h2>Account Name</h2>
            <p>Total XP: 1,234,567</p>
          </div>
        </div>
        <h2>GE Trends</h2>
      </header>
    </div>
  );
}

export default Home;
