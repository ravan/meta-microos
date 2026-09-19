SUMMARY = "LXQt Notification daemon"
DESCRIPTION = "The LXQt Notification daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-notificationd-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "dd910b966be9cc09db3e98562a2087ddda297226014261dee122c2769f6f06a18d751003a44d4002f572d33faecbd0e68797466a5093a57ab410402d2071e025"

RPROVIDES:${PN} += "config-lxqt-notificationd \
lxqt-notificationd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6WindowSystem.so.6 \
libLayerShellQtInterface.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xdg.so.4 \
libc.so.6 \
liblxqt.so.2 \
libstdc++.so.6"

inherit rpm
