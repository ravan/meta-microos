SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6CalendarEvents6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e8c085302e89b74257cb9ff27e7c5d0bdab461cb34eec0e7d335e0dc29f1daf08baf37ab2dfa26205e92e5c39bc30767a6abca8fd0af26df52de7052baf23cec"

RPROVIDES:${PN} += "libKF6CalendarEvents.so.6 \
libKF6CalendarEvents6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
