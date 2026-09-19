SUMMARY = "YaST2 - Testsuite"
DESCRIPTION = "This is a package for the YaST2 modules testsuite preparation and \
execution."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "yast2-testsuite-5.0.0-1.9.noarch.rpm"
RPM_HASH = "fabf77548dff32159ccefce2224f12e62539eeb34c794a098e25f41735dbb8096d409590258a61d76e90858d8439b4a68f0ba2a0bfe9c8aced1a02f04d5839e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-testsuite"

RDEPENDS:${PN} += "dejagnu \
expect \
yast2-core"

inherit rpm
