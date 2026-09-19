SUMMARY = "Qt5 Widgets Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 Widgets Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.12"

RPM_NAME = "libFcitx5Qt5WidgetsAddons2-5.1.12-1.10.aarch64.rpm"
RPM_HASH = "c46d801bb770d7a3e801aa6df5533b183db9a75588476cfc8cccb2ba701b60dfff4a231f96666d249efe217c33ae6c2f290a3d929b2d577aaf00b27ac492af61"

RPROVIDES:${PN} += "libFcitx5Qt5WidgetsAddons.so.2 \
libFcitx5Qt5WidgetsAddons2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
