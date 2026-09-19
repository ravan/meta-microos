SUMMARY = "KDE Plasma plasmoid for supergfxctl"
DESCRIPTION = "KDE Plasma plasmoid for supergfxctl. \
Features: \
* Graphics mode switching \
* dGPU power indication \
* Dynamic plasmoid logo, tooltip, status \
* Filter available switches \
* Display dbus error message \
* Revert change"
LICENSE = "MPL-2.0"

PV = "2.1.1"

RPM_NAME = "supergfxctl-plasmoid-2.1.1-3.5.aarch64.rpm"
RPM_HASH = "41e3ae2241c704f3c0f9c1f5c585ce9dcbe1b1c2ae49a89cb9caa99fdb66d80c23c5c4b5a40159f2ab29c1babbfa5019c7f36f253089697f83edbd8502795bad"

RPROVIDES:${PN} += "supergfxctl-plasmoid"

RDEPENDS:${PN} += "hicolor-icon-theme \
kf6-kirigami-imports \
kf6-ksvg-imports \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Solid.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.ksvg \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.configuration \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.extras \
qt6qmlimport-org.kde.plasma.plasmoid \
supergfxctl"

inherit rpm
