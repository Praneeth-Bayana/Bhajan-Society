"use client";

const Signout = () => {
    const logoutUser = async () => {
        try {
            const response = await fetch("http://localhost:999/bajansociety/user/logout", {
                method: "GET",
                headers: {
                    "Content-Type": "application/json",
                },
            });

            if (response.ok) {
                window.alert("Logout Successful, redirecting to home page!")
                window.location.href = "/";
                localStorage.removeItem("isLoggedIn");

            } else {
                console.error("Logout failed");
            }
        } catch (error) {
            console.error("Error during logout", error);
        }
    };
    logoutUser();

    return (
        <div>
            {/*Logging out...*/}
        </div>
    );
};

export default Signout;