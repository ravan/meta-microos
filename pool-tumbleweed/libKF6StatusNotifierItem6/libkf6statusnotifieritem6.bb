SUMMARY = "Implementation of Status Notifier Items"
DESCRIPTION = "Implementation of Status Notifier Items."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6StatusNotifierItem6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "9da868a0c69f87ba25860f648315b41c03f65d97caee9837536b0474bae5ec0df589432afc1f23a31ac9739871a59fd20fd0e5ee6bcced00da10d3c3d95b9725"

RPROVIDES:${PN} += "libKF6StatusNotifierItem.so.6 \
libKF6StatusNotifierItem6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kstatusnotifieritem \
ld-linux-aarch64.so.1 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
