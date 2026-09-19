SUMMARY = "QtQuick bindings for classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. This package provides QtQuick bindings \
for the KCMUtils libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcmutils-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "7a43fd5040761afc9202a86275600eeeebdf5fe549119e051d403a61c7134832bbfb4c90f782c95696a693b06a334e9e7b72ad3b21650c6e82a7370bbde13d68"

RPROVIDES:${PN} += "kf6-kcmutils-imports \
libkcmutilsprivateqmlplugin.so \
libkcmutilsqmlplugin.so \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.kcmutils.1 \
qt6qmlimport-org.kde.kcmutils.private \
qt6qmlimport-org.kde.kcmutils.private.254 \
qt6qmlimport-org.kde.kcmutils.private.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ItemViews.so.6 \
libKF6KCMUtils6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsCore6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KCMUtilsQuick6 \
libKF6KIOGui.so.6 \
libKF6Service.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window.2 \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.2"

inherit rpm
