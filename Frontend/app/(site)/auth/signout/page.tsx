import Signout from "@/components/Auth/Signout";
import { Metadata } from "next";

export const metadata: Metadata = {
    title: "Logout Page - Solid SaaS Boilerplate",
    description: "This is Logout page for Startup Pro",
    // other metadata
};

const SignoutPage = () => {
    return (
        <>
            <Signout />
        </>
    );
};

export default SignoutPage;
