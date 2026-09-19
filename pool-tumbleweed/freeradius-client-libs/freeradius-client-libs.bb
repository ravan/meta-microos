SUMMARY = "Shared library of FreeRADIUS Client"
DESCRIPTION = "The package contains the shared library of FreeRADIUS Client"
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "freeradius-client-libs-1.1.7-3.9.aarch64.rpm"
RPM_HASH = "11e1051904e1b16265e05deb0b16742f6bae26963ba45eda5898611af9a5728a99aa0a35566136b5eae8505b19fa029db9feb7662f65f766b0ebe4906b3402ea"

RPROVIDES:${PN} += "freeradius-client-libs \
libfreeradius-client.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnettle.so.8"

inherit rpm
