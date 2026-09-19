SUMMARY = "Shared Qt library for GPS applications"
DESCRIPTION = "This package provides the shared Qt library for gpsd and other GPS aware \
applications."
LICENSE = "BSD-3-Clause"

PV = "3.27.5"

RPM_NAME = "libQgpsmm32-3.27.5-3.2.aarch64.rpm"
RPM_HASH = "078076dabc599eb224d4bdcca26ab328461c45ef34599a5b593fe6da4359e7a47dd62f39a4177923bea1b2c667c41928f74a390a82a700e41604f1be3034d8ad"

RPROVIDES:${PN} += "libQgpsmm.so.32 \
libQgpsmm32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
