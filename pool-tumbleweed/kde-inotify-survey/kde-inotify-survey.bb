SUMMARY = "Monitor inotify limits and inform the user when they are reached"
DESCRIPTION = "Tooling for monitoring inotify limits and informing the user \
when they have been or are about to be reached."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kde-inotify-survey-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f862e4c7043608aa8d2380b4a02a112e448b58fed42bf1c4f88fc6af3e684672d305899d0968ba186cbb017ef23e8993e2aab0508547be34d2c55d981bd219c7"

RPROVIDES:${PN} += "kde-inotify-survey"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6Notifications.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
