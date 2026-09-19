SUMMARY = "Task management and system monitoring library -- QML bindings"
DESCRIPTION = "This package provides QtQuick bindings for libksysguard, allowing its use in \
QML applications."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libksysguard6-imports-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "0c74b6028661c4e899b184e912940b06384a689e8b9323664dee8bdee8cc4cf72056e5062618e4fdd9a705b16b115eee687177ed45afd46df93154d958f6211d"

RPROVIDES:${PN} += "libFormatterplugin.so \
libSensorFacesPrivate.so \
libSensorFacesplugin.so \
libSensorsplugin.so \
libksysguard6-imports \
libprocesscoreplugin.so \
qt6qmlimport-org.kde.ksysguard.faces \
qt6qmlimport-org.kde.ksysguard.faces.1 \
qt6qmlimport-org.kde.ksysguard.faces.private \
qt6qmlimport-org.kde.ksysguard.faces.private.1 \
qt6qmlimport-org.kde.ksysguard.formatter \
qt6qmlimport-org.kde.ksysguard.formatter.1 \
qt6qmlimport-org.kde.ksysguard.process \
qt6qmlimport-org.kde.ksysguard.process.1 \
qt6qmlimport-org.kde.ksysguard.sensors \
qt6qmlimport-org.kde.ksysguard.sensors.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKSysGuardFormatter.so.2 \
libKSysGuardSensorFaces.so.2 \
libKSysGuardSensors.so.2 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libksysguard6 \
libprocesscore.so.11 \
libstdc++.so.6 \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.quickcharts \
qt6qmlimport-org.kde.quickcharts.controls"

inherit rpm
