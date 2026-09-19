SUMMARY = "Task management and system monitoring library"
DESCRIPTION = "Task management and system monitoring library."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libksysguard6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "406dfac432d9863ecde3643bc118d7897e261fb3049f3b27e81e57999d278c3350b9d7191ca835af5fe9297d687552ba3788c9ce9f8a6eead52d17c7a5fef753"

RPROVIDES:${PN} += "libKSysGuardFormatter.so.2 \
libKSysGuardSensorFaces.so.2 \
libKSysGuardSensors.so.2 \
libksysguard5 \
libksysguard6 \
libprocesscore.so.11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigQml.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Package.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKSysGuardSystemStats.so.2 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
qt6qmlimport-Qt5Compat.GraphicalEffects \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.ksysguard.faces \
qt6qmlimport-org.kde.ksysguard.formatter \
qt6qmlimport-org.kde.ksysguard.sensors \
qt6qmlimport-org.kde.quickcharts \
qt6qmlimport-org.kde.quickcharts.controls"

inherit rpm
