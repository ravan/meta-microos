SUMMARY = "Library providing many low-level data structures"
DESCRIPTION = "The libmaa library provides many low-level data structures which can \
be used for writing compilers, hash tables, sets, lists, \
debugging support, and memory management. libmaa was originally \
implemented as a foundation for the 'kheperalong' package."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "libmaa4-1.5.1-2.1.aarch64.rpm"
RPM_HASH = "3f0737859703bc07279a509482c5394d845a27eb5187ad73aaab622f1b546dbc32f1b4535dd1f491a3bb7896a3a673bb51df5c58dc1abd7159ed0f55e1db7465"

RPROVIDES:${PN} += "libmaa.so.4 \
libmaa4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
