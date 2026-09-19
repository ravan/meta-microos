SUMMARY = "Large set of desktop widgets"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5WidgetsAddons5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "26dbf05cc3838584e98fc52e82ae16d79b7c5682aa0e37483bfeb80fa6e53dacfd3478799caceab0b26b1ecc0e0446b0df4997fa6b3f475de5883a3c15e61495"

RPROVIDES:${PN} += "libKF5WidgetsAddons.so.5 \
libKF5WidgetsAddons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
