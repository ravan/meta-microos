SUMMARY = "Shared library for GPS applications"
DESCRIPTION = "This package provides the shared library for gpsd and other GPS aware \
applications."
LICENSE = "BSD-3-Clause"

PV = "3.27.5"

RPM_NAME = "libgps32-3.27.5-3.2.aarch64.rpm"
RPM_HASH = "467e11589ac7f7e1de71f901954c47b1da445d75c3614578d3727ff564c5cc9c9ec95f96d53cb4b9d950fa4eff61932673bf08590153220311e7f795f42be32b"

RPROVIDES:${PN} += "libgps.so.32 \
libgps32 \
libgpsdpacket.so.32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
