import { Metadata } from "next";
import Hero from "@/components/Hero";
import Feature from "@/components/Features";
import About from "@/components/About";
import FeaturesTab from "@/components/FeaturesTab";
import FunFact from "@/components/FunFact";
import CTA from "@/components/CTA";
import FAQ from "@/components/FAQ";
// import Pricing from "@/components/Pricing";
import Contact from "@/components/Contact";
import Blog from "@/components/Blog";
// import Testimonial from "@/components/Testimonial";

export const metadata: Metadata = {
  title: "Bhajan Society",
  description: "a charitable organization whose aim is to foster a diverse and inclusive environment for everyone to learn, understand, practice and share cultural and religious values",
  // other metadata
};

export default function Home() {
  return (
    <main>
      <Hero />
      {/* <Feature />
      <About />
      <FeaturesTab />
      <FunFact /> */}
      <CTA />
      <FAQ />
      {/* <Testimonial /> */}
      {/* <Pricing /> */}
      <Contact />
      <Blog />
    </main>
  );
}
