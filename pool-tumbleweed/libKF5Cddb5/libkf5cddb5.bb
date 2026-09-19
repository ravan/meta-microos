SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for applications to fetch \
and submit audio CD information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "25.04.3"

RPM_NAME = "libKF5Cddb5-25.04.3-15.1.aarch64.rpm"
RPM_HASH = "5df233adf04baa623dd0c859ffd90020baa333ae89c2cb915dd675ac44bc9fcba7594f1a182db5fc71004e51032e5f54a397ab1d7b0a6809542965024814673c"

RPROVIDES:${PN} += "libKF5Cddb.so.5 \
libKF5Cddb5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libmusicbrainz5.so.1 \
libstdc++.so.6"

inherit rpm
