SUMMARY = "Multimedia Player"
DESCRIPTION = "Dragon Player is a simple video player."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "dragonplayer-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "83038225febc2aad19a34522b2b3b5be4d9fbf91c632da4611b49819817713574524b0fe2c7d00a2943341bd53ecacbc75c5926625a3e706283424273e3f7e42"

RPROVIDES:${PN} += "dragonplayer \
libdragonmodule.so \
qt6qmlimport-org.kde.dragon \
qt6qmlimport-org.kde.dragon.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kconfig-imports \
kf6-kcoreaddons-imports \
kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6KIOCore.so.6 \
libKF6Service.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libavcodec.so.62 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6-multimedia-imports \
qt6qmlimport-Qt.labs.animation \
qt6qmlimport-QtCore \
qt6qmlimport-QtMultimedia \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Effects \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.config \
qt6qmlimport-org.kde.coreaddons \
qt6qmlimport-org.kde.kirigami"

inherit rpm
