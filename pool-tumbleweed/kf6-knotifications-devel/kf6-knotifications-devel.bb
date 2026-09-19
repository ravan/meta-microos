SUMMARY = "KDE Desktop notifications: Build Environment"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-knotifications-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "7f1a5c6cbf7f3d79aca0278477dfbab62f2f856b653010b66f7dd339d5cd34e420849fc21b3346906ca23f5665a01a2d3239cc16385be5f45fd2f9496c5f4a0f"

RPROVIDES:${PN} += "cmake-KF6Notifications \
kf6-knotifications-devel"

RDEPENDS:${PN} += "cmake-Qt6DBus \
cmake-Qt6Gui \
cmake-Qt6Widgets \
libKF6Notifications6"

inherit rpm
