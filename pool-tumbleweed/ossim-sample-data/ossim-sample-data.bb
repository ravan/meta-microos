SUMMARY = "OSSIM data samples files"
DESCRIPTION = "The OSSIM data samples files for tests."
LICENSE = "LGPL-3.0-only"

PV = "2.12.1"

RPM_NAME = "ossim-sample-data-2.12.1-1.1.noarch.rpm"
RPM_HASH = "9634d9b6a8120d88c45c7b1d730204a2893c4a7c51adadf8d044bb1e8c7b329ea402ff42894ab4bbb589b247a2a4ea4e2a1617eb89e63745bb20651d7e3bbd48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ossim-sample-data"

RDEPENDS:${PN} += ""

inherit rpm
