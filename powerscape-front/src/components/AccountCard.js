import React from "react"
import { Outlet, Link } from "react-router-dom";

export default function AccountCard(props) {
    console.log(props)
    return (
        <Link className="acc-box" to="/viewaccount">
            <h2>{ props.accountName }</h2>
            <p>{ props.accountXP }</p>
        </Link>
    )
}