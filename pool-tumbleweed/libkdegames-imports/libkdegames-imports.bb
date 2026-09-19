SUMMARY = "QML modules for KDE games"
DESCRIPTION = "This package contains QML modules for KDE games."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkdegames-imports-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f8210e0843bb0fc4998dc92e7c057abcdda04662e474062d5b1b1b06124e7a5d6c7190d3715875927d8960c69ea8aad1b1f8bdc3af3e1f17331d9d09987ddefc"

RPROVIDES:${PN} += "libcorebindingsplugin.so \
libkdegames-imports \
qt6qmlimport-org.kde.games.core \
qt6qmlimport-org.kde.games.core.0 \
qt6qmlimport-org.kde.games.core.254"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick.2"

inherit rpm
