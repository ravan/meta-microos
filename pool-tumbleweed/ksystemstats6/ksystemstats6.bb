SUMMARY = "Plugin based system monitoring daemon"
DESCRIPTION = "KSystemStats is a daemon that collects statistics about the running system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "ksystemstats6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "772e3ba2c9540c012aabc2c0a51b0ffb2c301d1969f81246f3d2be7480f23d57de31b40774ba1169f035e5220e309acae998ab7c5c17ba720245f340df6d4b8b"

RPROVIDES:${PN} += "ksystemstats5 \
ksystemstats6"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6Solid.so.6 \
libKSysGuardFormatter.so.2 \
libKSysGuardSystemStats.so.2 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libprocesscore.so.11 \
libsensors.so.4 \
libstdc++.so.6 \
libudev.so.1 \
permissions"

inherit rpm
