SUMMARY = "Library for system monitoring plugins for KSystemStats"
DESCRIPTION = "This library is used by plugins for KSystemStats, a system monitoring daemon."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libKSysGuardSystemStats2-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "d5b50c4a000640846a3182ad213d2ba951f9ca16e3e01406bb0bc1730ed87124e6588f54a66719fa54c6741c591aac72cf47f10e5eb049f872ed14c8766c0640"

RPROVIDES:${PN} += "libKSysGuardSystemStats.so.2 \
libKSysGuardSystemStats2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ksysguardsystemstats6-data \
ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libsensors.so.4 \
libstdc++.so.6"

inherit rpm
