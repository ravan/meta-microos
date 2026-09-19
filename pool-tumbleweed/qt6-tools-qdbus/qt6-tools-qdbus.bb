SUMMARY = "Command line client for communication over D-Bus"
DESCRIPTION = "Command line client for communication over D-Bus."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-tools-qdbus-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "cc2503224e20876dfe1a5fb65a1fd692767c613667b63f21bc13a973d63d68c62e9c99403a864d55cca96605f7156ab24b20a0d6ab357ea212ddcb6e0f43bbb1"

RPROVIDES:${PN} += "qt6-tools-qdbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
