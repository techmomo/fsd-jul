import { useParams } from "react-router-dom"

export default function Aboutus() {
    const { id, name } = useParams(); 
    return(
        <>
         <h2>About us</h2>
         {id},{name}
        </>
    )
}
