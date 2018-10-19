const login = async () => {
    const loginResponse: Response = await fetch('http://localhost:8080/simple/login', {
        method: "POST", 
        mode: "cors",
        headers: {
            "Content-Type": "application/json; charset=utf-8",
            "Access-Control-Allow-Origin": "*"
        },
        body: `{
            "login": "alberto",
            "password": "password"
        }`
    })
   return loginResponse.json();
}

    

const userApi = { login }

export default userApi;
