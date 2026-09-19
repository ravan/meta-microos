SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.2.4.2"

RPM_NAME = "libindiclientqt2-2.2.4.2-1.1.aarch64.rpm"
RPM_HASH = "85a1b2f63073faca3fbbc2b555c4b96624c1e4dc56f8cabb1a4bf7ef192aec36534f6a81ccbd620625b961cb0c3a092306ce80eec391fa63ef23f25dcc57fb3d"

RPROVIDES:${PN} += "libindiclientqt.so.2 \
libindiclientqt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnova-0.15.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
