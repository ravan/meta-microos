SUMMARY = "Barcode abstraction layer library - QML files"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data. This package contains \
files that allow use of libprison with QtQuick based applications."
LICENSE = "MIT"

PV = "6.30.0"

RPM_NAME = "kf6-prison-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "85d4abd10879a2d70fe21f08ce9e26f13048904a267496e553081ac51f39df5f5c76cffecc59fca9919286c66256a14b57e550b990248de17a6e88eb78bb5096"

RPROVIDES:${PN} += "kf6-prison-imports \
libprisonquickplugin.so \
libprisonscannerquickplugin.so \
qt6qmlimport-org.kde.prison \
qt6qmlimport-org.kde.prison.1 \
qt6qmlimport-org.kde.prison.scanner \
qt6qmlimport-org.kde.prison.scanner.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Prison.so.6 \
libKF6Prison6 \
libKF6PrisonScanner.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
