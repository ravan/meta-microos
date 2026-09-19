SUMMARY = "Plasma applet and services for creating encrypted vaults"
DESCRIPTION = "Plasma Vault is a plasmoid for creating and managing encrypted vaults"
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-vault-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "5dd15e4418f396718451535da93ca6383490fc942d559effd995370c740943c5d6eed4822cef068be76cb5378b4b1d4c4f38002fbb5764e3dac3f834b3745687"

RPROVIDES:${PN} += "plasma-vault \
plasma6-vault"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6Service.so.6 \
libKF6WidgetsAddons.so.6 \
libPlasma.so.7 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libprocesscore.so.11 \
libstdc++.so.6 \
plasma6-vault-backend \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.extras \
qt6qmlimport-org.kde.plasma.plasmoid"

inherit rpm
