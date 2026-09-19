SUMMARY = "Python bindings for the Qt5 Data Visualization library"
DESCRIPTION = "PyQtDataVisualization is a set of Python bindings for the Qt5 Data \
Visualization library."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python314-qtdatavis3d-qt5-5.15.5-3.7.aarch64.rpm"
RPM_HASH = "e41134bb11b2254b5a1cfc267adeb5692b0972f1320ca6109d3ed9cdfe60017a7b0b96b5ca582028ba0a28cb3f0dee6618f3a326930db6dd99f228f9a1ce50fd"

RPROVIDES:${PN} += "python3.14dist-pyqtdatavisualization \
python314-PyQtDataVisualization \
python314-qtdatavis3d-qt5 \
python3dist-pyqtdatavisualization"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DataVisualization.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-qt5 \
python314-qt5-sip"

inherit rpm
