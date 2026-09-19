SUMMARY = "Plasma widget for the pass password manager"
DESCRIPTION = "Plasma Pass is a Plasma widget to access, display and copy passwords \
generated and stored by the 'pass' password manager."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "plasma-pass-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "ec14700c0e2a27378ec3bdd9bb0bdfa58db057a06d708814f2439978e2d6510bdd09c1d307fc66ffc2526ad9460ebe483beefd0b6b217c47557aa9cb05d53ad2"

RPROVIDES:${PN} += "libplasmapassplugin.so \
plasma-pass \
qt6qmlimport-org.kde.plasma.private.plasmapass \
qt6qmlimport-org.kde.plasma.private.plasmapass.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemModels.so.6 \
libPlasma5Support.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgpgmepp.so.7 \
liboath.so.0 \
libqgpgmeqt6.so.15 \
libstdc++.so.6 \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.extras \
qt6qmlimport-org.kde.plasma.plasmoid"

inherit rpm
