SUMMARY = "A collection of helpers and mock objects for unit tests and doc tests"
DESCRIPTION = "TestFixtures is a collection of helpers and mock objects that are \
useful when writing unit tests or doc tests. \
 \
If you're wondering why 'yet another mock object library', testing is \
often described as an art form and as such some styles of library will \
suit some people while others will suit other styles. This library \
contains common test fixtures the author found himself \
repeating from package to package and so decided to extract them into \
their own library and give them some tests of their own!"
LICENSE = "MIT"

PV = "12.3.0"

RPM_NAME = "python313-testfixtures-12.3.0-2.1.noarch.rpm"
RPM_HASH = "23994c3ad1c3e09f832d9e3da6870b13dacedd325fd4c28d22d2d66ed45ddf4b2904b3cb4da31d1ae633d21ac318690d0def20dfff6e91b9d61e362b19b68f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testfixtures \
python3.13dist-testfixtures \
python313-testfixtures \
python3dist-testfixtures"

RDEPENDS:${PN} += "python-abi"

inherit rpm
