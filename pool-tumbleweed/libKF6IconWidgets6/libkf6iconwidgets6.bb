SUMMARY = "Icon GUI utilities"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6IconWidgets6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "9eb9ea6e0bdb0787e025b8c58ebac15d12d6c1df70f2e493fb2818b4e68900b2d081624f975db4deec41bedda2643237a10c0ea6d386e7ca2a998bc9d4009ea3"

RPROVIDES:${PN} += "libKF6IconWidgets.so.6 \
libKF6IconWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kiconthemes \
ld-linux-aarch64.so.1 \
libKF6ConfigGui.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
