SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & GPL-3.0-or-later"

PV = "25.12.3"

RPM_NAME = "libKF5Dcraw5-25.12.3-1.6.aarch64.rpm"
RPM_HASH = "128e5ae8c8b908e3e427744d05b515e0940395cfb9eb44193d3841e6fd55ae8a97920e32b9ff947b1740fcdfb2244ec13beac88a4a26c7e7d60a3e8d7adcfb22"

RPROVIDES:${PN} += "libKF5Dcraw5 \
libKF5KDcraw.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkdcraw-qt5 \
libm.so.6 \
libraw.so.25 \
libstdc++.so.6"

inherit rpm
