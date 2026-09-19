SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "14.4.0+git12698"

RPM_NAME = "libgo23-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "a2a25585feb0586a7541c34d18aad9252665040accff76d9d4d1c78de983f2a2dee7ae1c9c5ae6be05fb4610e8760324ada999f1cfd683403eb509ed6801c7e0"

RPROVIDES:${PN} += "libgo.so.23 \
libgo23"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
