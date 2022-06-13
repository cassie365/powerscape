import React from "react"

export default function SkillBlock(props){
    return(
        <div className="skillBlock">
            <img src={ props.img }/>
            <span>{ props.name }</span>
            <span>{ props.level }</span>
        </div>
    )
}