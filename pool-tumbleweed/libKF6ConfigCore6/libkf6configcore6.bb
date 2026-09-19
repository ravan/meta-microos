SUMMARY = "System for configuration files"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
KConfigCore provides access to the configuration files themselves."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6ConfigCore6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "7349246a9296128f508bea269f3764d208834551dfcf83005df72ef14e7630c1c743d90fb05b00dbf3ee21c9223b9d6f1138a8c93fea5eb1da73febb2693b0b0"

RPROVIDES:${PN} += "libKF6ConfigCore.so.6 \
libKF6ConfigCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
