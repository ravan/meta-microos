SUMMARY = "QML utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used QML items as well as \
QML-related classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-qml-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "d8ba549b2e8fdf6237e5c355b19ac9cde88243f1ee55ccd89a5fb978c9440f50653dc733f8909bff94884423d9c7328e558f90958029ab1609377cc0ef4f7cf5"

RPROVIDES:${PN} += "libleechcraft-util-qml-qt6-0-6-75 \
libleechcraft-util-qml-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libQtQuick5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libqwt-qt6.so.6.3 \
libstdc++.so.6"

inherit rpm
