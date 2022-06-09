import './ViewAccount.css';

/*
For Current Skills, Need to decide how we want to pull current level data using api calls
For Progress Filters, need to decide what filters to start with
For Skill Progress section, we will want to add some fancy charts to display progress
*/
function ViewAccount(){
    return(
        <div className='mainContent'>
            <h1>View Account</h1>
            <div className='content'>
                <div className='col'>
                    <div className='currentSkills'>
                        <ul>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                            <li>Attack</li>
                        </ul>
                    </div>
                </div>
                <div className='col'>
                    <div className='progressFilters'>

                    </div>
                    <div className='skillProgress'>
                        
                    </div>
                </div>
            </div>
        </div>
    );
}

export default ViewAccount;