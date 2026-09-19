SUMMARY = "Python bindings for the Qt5 Data Visualization library"
DESCRIPTION = "PyQtDataVisualization is a set of Python bindings for the Qt5 Data \
Visualization library."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python313-qtdatavis3d-qt5-5.15.5-3.7.aarch64.rpm"
RPM_HASH = "991ac81ab8823f101d3b12051816c4bcc5cdb747e223ae7cf737a1f79e4fa8038524738f3c5c81bf844eead7079954e0b9f0a0c944e4748d3e2427a568b20b3c"

RPROVIDES:${PN} += "python3-PyQtDataVisualization \
python3-qtdatavis3d-qt5 \
python3.13dist-pyqtdatavisualization \
python313-PyQtDataVisualization \
python313-qtdatavis3d-qt5 \
python3dist-pyqtdatavisualization"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DataVisualization.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-qt5 \
python313-qt5-sip"

inherit rpm
