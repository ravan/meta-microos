SUMMARY = "LeechCraft Network Monitor Module"
DESCRIPTION = "This package provides another Network Monitor plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lemon-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "f53cf93102fff89d5ff918c1bfbfeaf8737177259c5c88d0268da22b74268f0bc838b45b4383c854b5767696ea3d1c603f424070274ae7334f334b693b6c3ad1"

RPROVIDES:${PN} += "leechcraft-lemon \
libleechcraft-lemon.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libqwt-qt6.so.6.3 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Window.2"

inherit rpm
