SUMMARY = "Plasma QML components"
DESCRIPTION = "Plasma QML and runtime components based upon KF6 and Qt6"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libplasma6-components-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "8974d8f4f3bf019fcdc574ac35d394d40bb70d22094896c37abe822d8d11f9bbf9c8866303c50fccb06d160084a2cab378bce7c69a8ce7a10c5b7964d9f093f0"

RPROVIDES:${PN} += "libcorebindingsplugin.so \
liborg-kde-plasmacomponents3.so \
libplasma6-components \
libplasmaconfigplugin.so \
libplasmaextracomponentsplugin.so \
libplasmoidplugin.so \
plasma6-framework \
plasma6-framework-components \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.components.3 \
qt6qmlimport-org.kde.plasma.configuration \
qt6qmlimport-org.kde.plasma.configuration.2 \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.core.2 \
qt6qmlimport-org.kde.plasma.extras \
qt6qmlimport-org.kde.plasma.extras.2 \
qt6qmlimport-org.kde.plasma.plasmoid \
qt6qmlimport-org.kde.plasma.plasmoid.2"

RDEPENDS:${PN} += "kf6-kdeclarative-imports \
kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libGLX.so.0 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6Package.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKirigamiPlatform.so.6 \
libPlasma.so.7 \
libPlasmaQuick.so.7 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libplasma6-desktoptheme \
libstdc++.so.6 \
libxcb-composite.so.0 \
libxcb-damage.so.0 \
libxcb-render.so.0 \
libxcb.so.1 \
qt6-declarative-imports \
qt6qmlimport-Qt5Compat.GraphicalEffects \
qt6qmlimport-QtQml \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.config \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.ksvg"

inherit rpm
