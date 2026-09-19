SUMMARY = "Development headers for Boost.Test library"
DESCRIPTION = "Development headers for Boost.Test library. Boost.Test supports for \
simple program testing, full unit testing, and for program execution \
monitoring. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_test-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "10f69de9b3f9efc0e5e085e1d7dbe53a342e2e30bc9aa16bfe2516d46157afcca2023c72700548762ace0acbed3c4e44374f667880d6a2eb4f0fcd99439c1327"

RPROVIDES:${PN} += "libboost-test-devel"

RDEPENDS:${PN} += "libboost-test1-91-0-devel"

inherit rpm
