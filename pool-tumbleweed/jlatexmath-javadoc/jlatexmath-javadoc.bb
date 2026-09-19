SUMMARY = "API Documentation for jlatexmath"
DESCRIPTION = "This package contains the API documentation for jlatexmath."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "jlatexmath-javadoc-1.0.3-7.8.noarch.rpm"
RPM_HASH = "181084d95eb6751530907d4265627846d6d45be70790c3d3034b96fba22cffe165fe0bab005228006f09ea8f6d26f586b377ed99fdf162f4ad4f37ee57ad4665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlatexmath-javadoc"

RDEPENDS:${PN} += "jlatexmath"

inherit rpm
