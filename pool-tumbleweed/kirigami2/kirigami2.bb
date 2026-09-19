SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kirigami2-5.116.0-1.13.aarch64.rpm"
RPM_HASH = "cbdd56836deea6f7c5324ffb9470dfecfbb0df864637c14dac6535b7a33134df72e3a94a9f84a29450cf69b498c4089c040cd6b741b632dac55081b7398cc1cf"

RPROVIDES:${PN} += "kirigami2 \
libKirigamiPlugin.so \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kirigami.private.2 \
qt5qmlimport-org.kde.kirigami.templates.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Kirigami2.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Material.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kirigami.private.2 \
qt5qmlimport-org.kde.kirigami.templates.2"

inherit rpm
