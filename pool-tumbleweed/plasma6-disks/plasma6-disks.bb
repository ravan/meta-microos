SUMMARY = "Plasma service for monitoring disk health"
DESCRIPTION = "Monitors S.M.A.R.T. capable devices for imminent failure and informs the user."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-disks-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "ff073deb40c2f106f3eafd9be8923f3b057e47c1833b5d8456a635caacb7b38b425576ee1a2afc50f6d042d5a8dc1097767b7923f9d09f1ec05a0b37b60f926c"

RPROVIDES:${PN} += "plasma5-disks \
plasma6-disks"

RDEPENDS:${PN} += "/usr/sbin/smartctl \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
