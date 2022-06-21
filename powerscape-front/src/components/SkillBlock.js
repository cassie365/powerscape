import React from "react"

export default function SkillBlock(props){
    return(
        <div className="skillBlock">
            <span className="skill--icon">
                <img src={ props.img }/>
            </span>
            <span className="skill--name">{ props.name }</span>
            <span className="skill--lvl">{ props.level }</span>
        </div>
    )
}