import { Link } from "react-router-dom"

const TopMenu = ()=>{
    return(
        <nav>
            <ul>
                <li>
                    <Link to="/home"> Home</Link>
                </li>
                <li>
                    <Link to="/aboutus/us"> About us - US</Link>
                </li>
                <li>
                    <Link to="/aboutus/10/Techmomo"> About us</Link>
                </li>
                <li>
                    <Link to="/contactus"> Contact us</Link>
                </li>
            </ul>
        </nav>
    );
}

export default TopMenu;