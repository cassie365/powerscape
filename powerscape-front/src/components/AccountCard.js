import React,{useState,useEffect} from "react"
import { Outlet, Link } from "react-router-dom";

export default function AccountCard(props) {
    const [scores, setScores] = useState([])
    const scoresURL = 'http://localhost:8080/api/v1/scores/'+props.accountId
    console.log(scoresURL)

    const scoresResult = () => {
      fetch(scoresURL)
      .then((response) => response.json())
      .then((data) => {
        setScores(data)
      })
    }

    useEffect(() => {
        scoresResult()
      }, [])

    return (
        <Link className="acc-box" to={"/viewaccount"} state={{ id: props.accountId, name: props.accountName , scores: scores }}>
            <h2>{ props.accountName }</h2>
            <p></p>
        </Link>
    )
}