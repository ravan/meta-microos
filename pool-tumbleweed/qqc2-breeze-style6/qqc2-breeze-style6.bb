SUMMARY = "Breeze Style for Qt Quick"
DESCRIPTION = "A Qt Quick Controls 2 style engine that uses the desktop style to draw controls \
with QStyle."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "qqc2-breeze-style6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "9ca4a50ef81accb176039eff12678e97d6ca0cc8bc576569a02f1b2c7423d00af7db11e28fd33ae7580991ff8c78dbdf77e2424d1c7113a05a0299f4c5febcde"

RPROVIDES:${PN} += "libBreezeImpl.so \
libBreezeStyle.so \
qqc2-breeze-style6 \
qt6qmlimport-org.kde.breeze \
qt6qmlimport-org.kde.breeze.254 \
qt6qmlimport-org.kde.breeze.impl \
qt6qmlimport-org.kde.breeze.impl.2 \
qt6qmlimport-org.kde.breeze.impl.254 \
qt6qmlimport-org.kde.breeze.impl.6"

RDEPENDS:${PN} += "kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6GuiAddons.so.6 \
libKF6IconThemes.so.6 \
libKirigamiPlatform.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6qmlimport-QtQml \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls.impl \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.guiaddons \
qt6qmlimport-org.kde.kirigami"

inherit rpm
