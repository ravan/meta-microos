SUMMARY = "LeechCraft SideBar2 Module"
DESCRIPTION = "This package provides another side bar plugin for Leechcraft. \
 \
It is a sidebar with quick launch, tabs and tray areas."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-sb2-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "f05c85301fd7dd4f18d92fb150d8f732d505cf912858a35327aa36e5e056b39cdbd691bc2a43bc5d0fd475533691e2d13ffe294dd5b72160b3c217b348c9d717"

RPROVIDES:${PN} += "leechcraft-sb \
leechcraft-sb2 \
libleechcraft-sb2.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-shortcuts-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-x11-qt6.so.0.6.75 \
libleechcraft-util-xsd-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Layouts"

inherit rpm
