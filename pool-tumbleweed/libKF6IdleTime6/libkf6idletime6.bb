SUMMARY = "User and system idle time reporting singleton"
DESCRIPTION = "KIdleTime is a singleton reporting information on idle time. It is useful not \
only for finding out about the current idle time of the PC, but also for getting \
notified upon idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6IdleTime6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "7bc87abb1980495491b5e86f09721ea11a1240c2ce0a9671767a07bc5b400db554e2d3af4fb074eb60377c8da17065ea7daa1ec7fd83519d1b31df58255ae059"

RPROVIDES:${PN} += "libKF6IdleTime.so.6 \
libKF6IdleTime6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kidletime \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
