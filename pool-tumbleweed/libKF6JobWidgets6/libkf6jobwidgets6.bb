SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6JobWidgets6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "24996c2a07cf75711be78b99d405221f0198e5f52f768e9523e7b66630b26025511ec6a0c7ad59a930d9402c9b707cf2fbd6b99b3755c45a4e4a9604acfba6d9"

RPROVIDES:${PN} += "libKF6JobWidgets.so.6 \
libKF6JobWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kjobwidgets \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Notifications.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
