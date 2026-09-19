SUMMARY = "Qt6 Widgets Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt6 Widgets Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.12"

RPM_NAME = "libFcitx5Qt6WidgetsAddons2-5.1.12-1.10.aarch64.rpm"
RPM_HASH = "4e02bf83c3aa2b1f868f57e30d74bad21ed75e85007ca74773254e22c359cacd4ca99439eb5e9fc7894d28f34c66dfb4ea3ea74985c6c216a7f72cc6e84f9da8"

RPROVIDES:${PN} += "libFcitx5Qt6WidgetsAddons.so.2 \
libFcitx5Qt6WidgetsAddons2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
