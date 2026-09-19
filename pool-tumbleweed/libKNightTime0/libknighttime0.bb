SUMMARY = "Day-night cycle helper library"
DESCRIPTION = "This package contains the core library for KNightTime, a helper for dark-light day cycles."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "libKNightTime0-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "1c7c274d92f02764989ace15f6d284755ddf702e8eccf811f244e782f92ad88e0b1faa497fc5145ebefd08dd1f08749c6212dc038b35e1a0d58e24f8bec4be8d"

RPROVIDES:${PN} += "libKNightTime.so.0 \
libKNightTime0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Holidays.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
