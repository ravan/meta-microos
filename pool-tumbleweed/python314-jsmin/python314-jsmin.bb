SUMMARY = "JavaScript minifier"
DESCRIPTION = "JavaScript minifier."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-jsmin-3.0.1-2.5.noarch.rpm"
RPM_HASH = "f282b0746ac6adddf84f5fdc519d2e7738bd264974b3062c372d1065b2d33f7b658840d71fb0047fbc4ef065810bcdb16637c748f36820672d27ee038d9312d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsmin \
python314-jsmin \
python3dist-jsmin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
