SUMMARY = "Minimal Plasma shell for embedded devices"
DESCRIPTION = "A minimal plasma shell package intended for embedded devices"
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-nano-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "49b3cdd95634c895533890f423487ce25b906842f7cf47e70ffad52309a037efde72e47b2e0ef1eaca53813360d1c02b6725e3eb131ed484a2bce9a8278eadc3"

RPROVIDES:${PN} += "libplasmananoshellprivateplugin.so \
plasma5-nano \
plasma6-nano \
qt6qmlimport-org.kde.plasma.private.nanoshell \
qt6qmlimport-org.kde.plasma.private.nanoshell.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Service.so.6 \
libKF6WindowSystem.so.6 \
libKWaylandClient.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libplasma6-components \
libstdc++.so.6 \
plasma6-workspace \
qt6qmlimport-Qt5Compat.GraphicalEffects \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtQuick.Window.2 \
qt6qmlimport-org.kde.draganddrop.2 \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.kquickcontrolsaddons.2 \
qt6qmlimport-org.kde.ksvg.1 \
qt6qmlimport-org.kde.newstuff.1 \
qt6qmlimport-org.kde.plasma.components.3 \
qt6qmlimport-org.kde.plasma.configuration.2 \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.plasmoid.2 \
qt6qmlimport-org.kde.plasma.private.shell.2 \
qt6qmlimport-org.kde.plasma.wallpapers.image.2"

inherit rpm
