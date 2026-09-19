SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.2.4.2"

RPM_NAME = "libindilx200-2-2.2.4.2-1.1.aarch64.rpm"
RPM_HASH = "afa6d9df2283c3d9f44f9153fb6d7e427b5d8794e5f0cbd028b66df9f03b2a99e0076ae99cbc8b2c5101d6e491b40ac02dcaabab3418f5a86e17c805424a77c9"

RPROVIDES:${PN} += "libindilx200-2 \
libindilx200.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnova-0.15.so.0 \
libstdc++.so.6"

inherit rpm
