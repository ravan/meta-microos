SUMMARY = "Configuration tool for fcitx5"
DESCRIPTION = "Configuration tool for fcitx5"
LICENSE = "GPL-2.0-or-later"

PV = "5.1.12"

RPM_NAME = "fcitx5-configtool-5.1.12-1.5.aarch64.rpm"
RPM_HASH = "0cbb695d27d393341936cd11f83ad56a40c4fcf4c225fc437b2ad77f9c90e26dc7a6381c6ad3163d43edfb95cf352499fe9e3d6eed01f258f6a0e626f10452ac"

RPROVIDES:${PN} += "fcitx-config-gtk3 \
fcitx5-configtool \
libFcitx5Migrator.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Qt6DBusAddons.so.1 \
libFcitx5Qt6WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libKF6ItemViews.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxkbfile.so.1"

inherit rpm
