test code


import './App.css';
import React, {useEffect, useState} from 'react'
import axios from 'axios';
import Calender from "./components/Calender";

function App() {
    const [examList, setExamList] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const {data} = await axios.get('https://jsonplaceholder.typicode.com/users');
                console.log(data);
                setExamList(data);
                setLoading(false);
            } catch (e) {
                console.log(e);
            }
        }
        fetchData().then(r => null);
    }, []);
    if (loading) {
        return (<h1>로딩중....</h1>)
    } else {
        return (

            <>
              <Calender/>

                <table>
                    <thead>
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>username</th>
                        <th>email</th>
                        <th>phone</th>
                        <th>website</th>
                    </tr>
                    </thead>
                    <tbody>
                    {dsLiteList.map((data) => (<tr key={data.id}>
                            <td>{data.id}</td>
                            <td>{data.name}</td>
                            <td>{data.username}</td>
                            <td>{data.email}</td>
                            <td>{data.phone}</td>
                            <td>{data.website}</td>
                        </tr>
                    ))}
                    </tbody>

                </table>
            </>
        );
    }
}

export default App;
