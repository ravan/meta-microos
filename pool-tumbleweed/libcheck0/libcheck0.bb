SUMMARY = "Unit Test Framework for C"
DESCRIPTION = "Check is a unit test framework for C. It features a simple interface for \
defining unit tests, limitating the developer the less possible. Tests \
are run in a separate address space, so Check cancatch both, assertion \
failures and code errors that cause segmentationfaults or other \
signals. The output of unit tests can be used within source code \
editors and IDEs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.2"

RPM_NAME = "libcheck0-0.15.2-2.21.aarch64.rpm"
RPM_HASH = "e02da5e82b5370d01d3a4c0916503f27f0ba71aa95b369d1048f5964b778f3c1987a47d19033df5026509977b3ad5ae0a95cebb620fbb129d4c2fad3dd188116"

RPROVIDES:${PN} += "check \
libcheck.so.0 \
libcheck0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
