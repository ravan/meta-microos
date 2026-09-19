SUMMARY = "LeechCraft Launcher Module"
DESCRIPTION = "This package provides a third-party application launcher plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-launchy-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "ccc210abac96344cca0844e0ca24a9b74ad8e8c2e38230a0ab21c57c9b12446b16c2529f7f3573a91925d79692ffaddb5095fce46d9767e7072999d395b8dd13"

RPROVIDES:${PN} += "leechcraft-launchy \
libleechcraft-launchy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-shortcuts-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xdg-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6qmlimport-QtQuick"

inherit rpm
