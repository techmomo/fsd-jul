import { Redirect } from "react-router-dom"

const UsAboutus = ()=>{
    return(
        <>
            <h3>US ABout Us ....</h3>
            {
                // perform redirect using router redirect
            }
            <Redirect to="/contactus"/>
        </>
    );
}

export default UsAboutus;