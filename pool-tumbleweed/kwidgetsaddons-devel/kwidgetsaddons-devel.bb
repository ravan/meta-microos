SUMMARY = "Large set of desktop widgets: Build Environment"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kwidgetsaddons-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "ff22bfb87c6f7d69a4d364a561bfd2b4f268e3b610909ab685255462642811df206ec18bd4ea07dffbcd14c1634f81a5257287d66bc798f86adee7a60e700e59"

RPROVIDES:${PN} += "cmake-KF5WidgetsAddons \
kwidgetsaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
ld-linux-aarch64.so.1 \
libKF5WidgetsAddons.so.5 \
libKF5WidgetsAddons5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
