import SkillBlock from './SkillBlock';
import './ViewAccount.css';

import attackIcon from '../images/skill_icon_attack1.gif';
import strengthIcon from '../images/skill_icon_strength1.gif';
import defenseIcon from '../images/skill_icon_defence1.gif';
import hitpointsIcon from '../images/skill_icon_hitpoints1.gif'
import rangedIcon from '../images/skill_icon_ranged1.gif'
import prayerIcon from '../images/skill_icon_prayer1.gif'
import magicIcon from '../images/skill_icon_magic1.gif'
import cookingIcon from '../images/skill_icon_cooking1.gif'
import woodcuttingIcon from '../images/skill_icon_woodcutting1.gif'
import fletchingIcon from '../images/skill_icon_fletching1.gif'
import fishingIcon from '../images/skill_icon_fishing1.gif'
import firemakingIcon from '../images/skill_icon_firemaking1.gif'
import craftingIcon from '../images/skill_icon_crafting1.gif'
import smithingIcon from '../images/skill_icon_smithing1.gif'
import miningIcon from '../images/skill_icon_mining1.gif'
import herbloreIcon from '../images/skill_icon_herblore1.gif'
import agilityIcon from '../images/skill_icon_agility1.gif'
import thievingIcon from '../images/skill_icon_thieving1.gif'
import slayerIcon from '../images/skill_icon_slayer1.gif'
import farmingIcon from '../images/skill_icon_farming1.gif'
import runecraftIcon from '../images/skill_icon_runecraft1.gif'
import hunterIcon from '../images/skill_icon_hunter1.gif'
import constructionIcon from '../images/skill_icon_construction1.gif'

/*
For Current Skills, Need to decide how we want to pull current level data using api calls
For Progress Filters, need to decide what filters to start with
For Skill Progress section, we will want to add some fancy charts to display progress
*/

const skills = ["Attack","Defense","Strength","Hitpoints","Ranged","Prayer","Magic","Cooking",
                "Woodcutting","Fletching","Fishing","Firemaking","Crafting","Smithing","Mining",
                "Herblore","Agility","Thieving","Slayer","Farming","Runecraft","Hunter","Construction"];

const icons = [attackIcon,strengthIcon,defenseIcon,hitpointsIcon,rangedIcon,prayerIcon,magicIcon,cookingIcon,woodcuttingIcon,fletchingIcon,fishingIcon,firemakingIcon,
                craftingIcon,smithingIcon,miningIcon,herbloreIcon,agilityIcon,thievingIcon,slayerIcon,farmingIcon,runecraftIcon,hunterIcon,constructionIcon];

export default function ViewAccount(){
    return(
        <div className='mainContent'>
            <h1 className='title'>View Account</h1>
            <div className='content'>
                <div className='col'>
                    <h1>Current Skills</h1>
                    <div className='currentSkills'>
                        {skills.map((skill, i) => <SkillBlock img={icons[i]} name={skill} level="99" />)}
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