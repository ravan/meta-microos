SUMMARY = "C++ API for the libcdio CD-ROM access library"
DESCRIPTION = "The libcdio package contains libraries for CD-ROM and CD image \
access. \
 \
This subpackage contains the C++ API library for cdio."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "libcdio++1-2.2.0-1.7.aarch64.rpm"
RPM_HASH = "18c8ef7f7bcd68f9dc7a316d477fc5635c1e6b7d3efdf005069113c836fdb429ebdb7d7d9d7a624c2c295642d80ce1f05ea2659cc39b3e5537d0070ed271324f"

RPROVIDES:${PN} += "libcdio++.so.1 \
libcdio++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libstdc++.so.6"

inherit rpm
