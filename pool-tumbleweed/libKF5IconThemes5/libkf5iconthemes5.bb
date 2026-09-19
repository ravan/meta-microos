SUMMARY = "Icon GUI utilities"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5IconThemes5-5.116.0-1.14.aarch64.rpm"
RPM_HASH = "9fc2b5c8e4b05429ba3bd5bb1226a7597f1f0bb317f7f22c71bd1b62259dea11bc946deb0d11921605c35617321f88192c3615f151ad4a1dc2197f51f70f4d8c"

RPROVIDES:${PN} += "libKF5IconThemes.so.5 \
libKF5IconThemes5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
