SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "7.5.0+r278197"

RPM_NAME = "libgo11-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "a0e2c3582a4a1a09d519fd8a7bb77e391cbf38d9bd05b864eef3030ae212700a39f3ea9205318bd5c545b47584e6a462d23057dfb3fef4f1f19a432dd9a25f05"

RPROVIDES:${PN} += "libgo.so.11 \
libgo11"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
