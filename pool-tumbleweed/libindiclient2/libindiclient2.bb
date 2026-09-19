SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.2.4.2"

RPM_NAME = "libindiclient2-2.2.4.2-1.1.aarch64.rpm"
RPM_HASH = "c4f00ef8708f5ac6d5296d9a3f432601812c26481b95bbe3d99d84f9655fe553dda6be8bb69b78d6f04ddf6e6b78372c5528e4569a0162d6163675603301a7b8"

RPROVIDES:${PN} += "libindiclient.so.2 \
libindiclient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnova-0.15.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
