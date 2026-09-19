SUMMARY = "LXQt Qt5 platform integration plugin"
DESCRIPTION = "A library libqtlxqt to integrate Qt5 with LXQt. With this plugin, all \
Qt5-based programs can adopt settings of LXQt, such as the icon theme."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "lxqt-qt5plugin-1.4.1-1.12.aarch64.rpm"
RPM_HASH = "b6c1ecd9a221ac7fec70c1cdf9eb84f90264b9b7ed90180c149742bdc303e0467b39a3a6151af6ea45b451bbb3c986611eff0aadc502841f73e826e535cb3985"

RPROVIDES:${PN} += "libqtlxqt.so \
lxqt-qt5plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5XdgIconLoader.so.3 \
libc.so.6 \
libdbusmenu-qt5.so.2 \
libstdc++.so.6"

inherit rpm
