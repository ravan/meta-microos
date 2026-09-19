SUMMARY = "An application for monitoring system resources"
DESCRIPTION = "plasma-systemmonitor provides an interface for monitoring system sensors, \
process information and other system resources."
LICENSE = "GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-systemmonitor-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "3496296e554a9e163682a48aeb5c67bb44cc76bdfd03dcbfa0bfea6af51ea3fbc95f197658df59599f67b3322983716bb9ea73976a164f8cff557466a3de70d7"

RPROVIDES:${PN} += "libPlasmaSystemMonitorPage.so \
libPlasmaSystemMonitorPageplugin.so \
libPlasmaSystemMonitorTable.so \
libPlasmaSystemMonitorTableplugin.so \
plasma5-systemmonitor \
plasma6-systemmonitor \
qt6qmlimport-org.kde.ksysguard.page \
qt6qmlimport-org.kde.ksysguard.page.254 \
qt6qmlimport-org.kde.ksysguard.page.6 \
qt6qmlimport-org.kde.ksysguard.table \
qt6qmlimport-org.kde.ksysguard.table.254 \
qt6qmlimport-org.kde.ksysguard.table.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
kf6-kiconthemes-imports \
kf6-kirigami-imports \
kf6-kitemmodels-imports \
kf6-knewstuff-imports \
kf6-kquickcharts \
kf6-qqc2-desktop-style \
kirigami-addons6 \
ksystemstats6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6ItemModels.so.6 \
libKF6KIOGui.so.6 \
libKF6NewStuffCore.so.6 \
libKF6Service.so.6 \
libKF6WindowSystem.so.6 \
libKSysGuardSensorFaces.so.2 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6qmlimport-Qt.labs.qmlmodels \
qt6qmlimport-QtQml \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.iconthemes \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.delegates \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.kquickcontrolsaddons \
qt6qmlimport-org.kde.ksysguard.faces \
qt6qmlimport-org.kde.ksysguard.formatter \
qt6qmlimport-org.kde.ksysguard.process \
qt6qmlimport-org.kde.ksysguard.sensors \
qt6qmlimport-org.kde.newstuff \
qt6qmlimport-org.kde.quickcharts \
qt6qmlimport-org.kde.quickcharts.controls"

inherit rpm
