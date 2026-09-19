SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6AuthCore6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "7f17fca4c002036e537dde63b508525faab88e3835a4550a604a6ddcb832c575a25519036748f3fd404209d674598be019eb704b94516c88943f946b81de36d2"

RPROVIDES:${PN} += "libKF6AuthCore.so.6 \
libKF6AuthCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kauth \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
