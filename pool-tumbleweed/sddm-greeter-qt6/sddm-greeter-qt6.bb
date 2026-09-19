SUMMARY = "SDDM Greeter for Qt6 themes"
DESCRIPTION = "This package provides the SDDM frontend for themes using Qt 6."
LICENSE = "GPL-2.0-or-later"

PV = "0.21.0+git57"

RPM_NAME = "sddm-greeter-qt6-0.21.0+git57-1.1.aarch64.rpm"
RPM_HASH = "d53d5ea55e4284d1cccc1146dd14c57f27d7ef400ada3803710fa2cecd7949e96fdec8d2aed6f4f51aad28c7736e3d5d69742f58d16ef939463cc1ecf161ef7d"

RPROVIDES:${PN} += "qt6qmlimport-SddmComponents \
qt6qmlimport-SddmComponents.2 \
sddm-greeter-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsystemd.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
qt6qmlimport-QtQuick.2 \
sddm"

inherit rpm
