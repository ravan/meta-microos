SUMMARY = "GTS Runtime Library"
DESCRIPTION = "This package provides the GTS runtime library."
LICENSE = "LGPL-2.0+"

PV = "0.7.6_p20121130"

RPM_NAME = "libgts-0_7-5-0.7.6_p20121130-4.41.aarch64.rpm"
RPM_HASH = "3c0e729727902bd2a4b2d4699155584f7d8641d1892a86d8232a5d33bcf39a9976d4ecd1b510c5f535de1c0396e15a675671d20b3d77a4abd3fb23fafd2b8a0b"

RPROVIDES:${PN} += "libgts-0-7-5 \
libgts-0.7.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
