SUMMARY = "EFL testsuite"
DESCRIPTION = "Testsuite of EFL package."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-testsuite-1.26.3-37.1.aarch64.rpm"
RPM_HASH = "9e1ee82cb627a233193b8216a444d0b21545ccaf34ef53407e34d3b7dda51978b7075453544ce639ddc57a0b0e4008688b466eafa669c9776590d938a15b46da"

RPROVIDES:${PN} += "efl-testsuite"

RDEPENDS:${PN} += "libefreet1"

inherit rpm
