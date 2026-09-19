SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.2.4.2"

RPM_NAME = "libindiAlignmentDriver2-2.2.4.2-1.1.aarch64.rpm"
RPM_HASH = "dd9091360821652f7172739ccb3014ae29070a04b50dda828083cbb4aa2650e851c5bb40028a88d755b7c00a889dfb1f60bf825f581fd716ae65c492ecb5197f"

RPROVIDES:${PN} += "libindiAlignmentDriver.so.2 \
libindiAlignmentDriver2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libindiclient.so.2 \
libm.so.6 \
libnova-0.15.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
