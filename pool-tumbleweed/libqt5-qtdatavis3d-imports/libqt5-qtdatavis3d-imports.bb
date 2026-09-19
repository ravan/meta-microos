SUMMARY = "QML imports for the Qt5 Data Visualization module"
DESCRIPTION = "This package contains QML import files for Qt5 Data Visualization module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtdatavis3d-imports-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "b2f7ee366a0cc57deb198e095c62e0e3bbba0627b20b7dc8928b3088d89612ff5a1cfda1bd72b5c2d97a6b5bd6cd9386fb6aa906ef235a38ae9500824999feb6"

RPROVIDES:${PN} += "libdatavisualizationqml2.so \
libqt5-qtdatavis3d-imports \
qt5qmlimport-QtDataVisualization.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DataVisualization.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
