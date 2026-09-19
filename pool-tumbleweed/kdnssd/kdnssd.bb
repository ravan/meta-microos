SUMMARY = "Zeroconf Support for KIO applications"
DESCRIPTION = "This package adds Zeroconf support to KIO, allowing the use of this protocol \
in all applications that are using KIO."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdnssd-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "60bf1581b9af86ce2d2b011cbb0226545c808279500c30d92763db21554eef1f3bd73b09540a18f671205d7b25309e6c954341fbf90383e74881d6f5430f220a"

RPROVIDES:${PN} += "kdnssd"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6DNSSD.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
