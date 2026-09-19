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

RPM_NAME = "python314-testfixtures-12.3.0-2.1.noarch.rpm"
RPM_HASH = "24ff0ab04910f74b7bc6fa78278b72497c31ee976f6563aff2d0f83144d86ea9c6538c6fb9636b02f6dd931b78ae8015b665879acf939791a64ca826b3c87054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-testfixtures \
python314-testfixtures \
python3dist-testfixtures"

RDEPENDS:${PN} += "python-abi"

inherit rpm
