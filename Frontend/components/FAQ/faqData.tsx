import { FAQ } from "@/types/faq";

const faqData: FAQ[] = [
  {
    id: 1,
    quest: "How do I register for an event on the website?",
    ans: "To register for an event, visit the event page on our website and look for the Register button. Click on it and follow the prompts to complete the registration process.",
  },
  {
    id: 2,
    quest: "Is there a registration fee for the event?",
    ans: "The registration fee, if any, will be mentioned on the event page. Please check the details before proceeding with the registration.",
  },
  {
    id: 3,
    quest: "I did not receive a confirmation email?",
    ans: "Check your spam or junk folder in case the confirmation email was filtered there. If you still can't find it, contact our support team with your registration details, and we will assist you.",
  },
  {
    id: 4,
    quest: "Technical difficulties with registration?",
    ans: "If you encounter any technical issues, please try refreshing the page or clearing your browser cache. If the problem persists, contact our technical support team for assistance.",
  },
];

export default faqData;
