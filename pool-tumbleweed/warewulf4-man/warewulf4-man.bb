SUMMARY = "Warewulf4 Man Pages"
DESCRIPTION = "Man pages for warewulf4."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "warewulf4-man-4.7.0-4.1.noarch.rpm"
RPM_HASH = "c7d5a554d01b427d59ebd25710e02178a81b5a3339f9372429600166b2d5d79d443164ccf4835a86f5816959b10160cec68a9f9f217230204109f3bd72bdae45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf4-man"

RDEPENDS:${PN} += ""

inherit rpm
