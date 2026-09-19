SUMMARY = "Large set of desktop widgets"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6WidgetsAddons6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "432c95a8c8aeafba71f4bd2beab091dc98b0813e489ec3bde4a98e9cf87247e006bae7e5269ba381f3941313097e55f2e3e8b83058e9fb93bc61b2d4b746dfdc"

RPROVIDES:${PN} += "libKF6WidgetsAddons.so.6 \
libKF6WidgetsAddons6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kwidgetsaddons \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
