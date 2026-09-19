SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5CalendarEvents5-5.116.0-1.14.aarch64.rpm"
RPM_HASH = "d7852621b714a8ae9fa087e87e418b811f9b1688f14844eaa19fe23204f44ef60a352ded7cd6df3b725b336181959ddf9e67aa582e6d65abd7e89b498669e31f"

RPROVIDES:${PN} += "libKF5CalendarEvents.so.5 \
libKF5CalendarEvents5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
