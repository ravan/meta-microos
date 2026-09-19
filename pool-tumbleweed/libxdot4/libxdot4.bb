SUMMARY = "Library for parsing and deparsing of xdot operations"
DESCRIPTION = "The libxdot library provides support for parsing and deparsing graphical \
operations specified by the xdot language."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "libxdot4-15.0.0-2.2.aarch64.rpm"
RPM_HASH = "f989d96b6d250adaccdba890808529ebf29123f855377eb29de70abc9fb3c97fba420eaeaa3750b378ee1f1cbb0b383c3759e5abbd3b8e9c19689a5c0e936bb4"

RPROVIDES:${PN} += "libxdot.so.4 \
libxdot4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
