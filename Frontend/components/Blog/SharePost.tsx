import Link from "next/link";

const SharePost = () => {
  return (
    <>
      <div className="mt-11 flex flex-wrap gap-4 md:items-center md:justify-between md:gap-0">
        <ul className="flex items-center gap-6">
          <li>
            <Link
              href="/auth/signin"
              className="flex items-center justify-center rounded-full bg-primary px-7.5 py-2.5 text-regular text-white duration-300 ease-in-out hover:bg-primaryho"
            >
              Register Now
            </Link>
          </li>
        </ul>

        {/* <ul className="flex items-center gap-4">
          <li>
            <p className="text-black dark:text-white">Tags:</p>
          </li>
          <li>
            <a
              href="#"
              className="pr-2 duration-300 ease-in-out hover:text-primary"
            >
              #business
            </a>

            <a href="#" className="duration-300 ease-in-out hover:text-primary">
              #saas
            </a>
          </li>
        </ul> */}
      </div>
    </>
  );
};

export default SharePost;
