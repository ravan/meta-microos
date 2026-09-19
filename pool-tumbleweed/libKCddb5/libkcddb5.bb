SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for applications to fetch \
and submit audio CD information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKCddb5-26.08.1-15.1.aarch64.rpm"
RPM_HASH = "ffc15c67b3aeaf0c47b09a1ab363c9f5a1c0608304c4eab87c8dc9d271bf40dab3257be55c7aa85fe762cb0601d3ace0fc92a7db718050d50e5fe92ba5b3f509"

RPROVIDES:${PN} += "libKCddb5 \
libKCddb6.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libmusicbrainz5.so.1 \
libstdc++.so.6"

inherit rpm
