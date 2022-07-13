import React from "react"
import { Outlet, Link } from "react-router-dom";

export default function AccountCard(props) {
    console.log(props.accountId)
    return (
        <Link className="acc-box" to={"/viewaccount"} state={{ id: props.accountId }}>
            <h2>{ props.accountName }</h2>
            <p>{ props.accountXP }</p>
        </Link>
    )
}