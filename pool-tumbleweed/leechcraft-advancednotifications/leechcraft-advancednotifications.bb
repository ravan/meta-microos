SUMMARY = "LeechCraft Notifications framework Module"
DESCRIPTION = "This package provides an advanced notifications plugin for Leechcraft \
which allows to customize notifications better."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-advancednotifications-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "e31033ccfeb7bb09cd848ddfd85ca1e76446f172c7f550d74c1101688ff9f495a7cd5f53f74e9735ed7c4e3faf65a4b28298053670ffd7f417f480bffc12ca60"

RPROVIDES:${PN} += "leechcraft-advancednotifications \
libleechcraft-advancednotifications.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-visualnotifications \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls"

inherit rpm
