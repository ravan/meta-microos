SUMMARY = "LXQt platform integration plugin"
DESCRIPTION = "A library libqtlxqt to integrate Qt with LXQt. With this plugin, all \
Qt-based programs can adopt settings of LXQt, such as the icon theme."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-qtplugin-2.4.0-1.5.aarch64.rpm"
RPM_HASH = "90a7fcec812391fae1e8cd40dcecaedc6c00e5d11b91879f82fefaedda5d3e61cd5716e91fb4e98e063aacf9b4887a8b43be9dee292b5a49ffdbda32a9694528"

RPROVIDES:${PN} += "libqtlxqt.so \
lxqt-qtplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6XdgIconLoader.so.4 \
libc.so.6 \
libdbusmenu-lxqt.so.0 \
libstdc++.so.6"

inherit rpm
