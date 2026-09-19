SUMMARY = "Plasma SDK"
DESCRIPTION = "Plasma SDK taylored for development of Plasma components, \
such as Widgets, Runners, Dataengines."
LICENSE = "GPL-2.0-only & LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-sdk-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "4c7bf28154bfd548cf39d681b0281d2232ec5a65a519967f403687a1baa8a598faf5301794495f79167fd7a208ee0f3f1a967bb0c88d12a107e84f18ea45466d"

RPROVIDES:${PN} += "plasma5-sdk \
plasma6-sdk \
plasmaengineexplorer5 \
plasmaengineexplorer6"

RDEPENDS:${PN} += "bash \
kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Package.so.6 \
libKF6Svg.so.6 \
libKF6TextEditor.so.6 \
libKF6WidgetsAddons.so.6 \
libPlasma.so.7 \
libPlasma5Support.so.6 \
libPlasmaQuick.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQml.2 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window.2 \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.kitemmodels.1 \
qt6qmlimport-org.kde.kquickcontrols.2 \
qt6qmlimport-org.kde.kquickcontrolsaddons.2 \
qt6qmlimport-org.kde.ksvg.1 \
qt6qmlimport-org.kde.newstuff.1 \
qt6qmlimport-org.kde.plasma.components.3 \
qt6qmlimport-org.kde.plasma.configuration.2 \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.extras.2 \
qt6qmlimport-org.kde.plasma.plasmoid.2 \
qt6qmlimport-org.kde.plasma.shell.panel.0"

inherit rpm
