SUMMARY = "QtQuick components for Akonadi"
DESCRIPTION = "This package contains QtQuick components for the libraries part of Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-imports-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5f171549ec4c615b47200343833902adc81c14dc31fcdf08543a648cb807f06dc3df4dc039100aede0583894d2aad798e8666f5ff992db61639e9b33bbb3c3d8"

RPROVIDES:${PN} += "akonadi-imports \
libakonadi-quick-plugin.so \
qt6qmlimport-org.kde.akonadi \
qt6qmlimport-org.kde.akonadi.254 \
qt6qmlimport-org.kde.akonadi.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6ItemModels.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiCore6 \
libKPim6AkonadiWidgets.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigamiaddons.components \
qt6qmlimport-org.kde.kirigamiaddons.delegates \
qt6qmlimport-org.kde.kirigamiaddons.formcard \
qt6qmlimport-org.kde.kitemmodels"

inherit rpm
