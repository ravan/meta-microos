SUMMARY = "Python bindings for the Qt Data Visualization library"
DESCRIPTION = "PyQt6-DataVisualization is a set of Python bindings for The Qt Company’s Qt DataVisualization framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-DataVisualization-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "fbc5e63447196330230684f83abf6b907b08c9acb20c7b69dfbd2f8fa1b99fcc88eb0d74b1edb75f9520a566efaec2a3b4e4352df5965a63f17aee40dee4632b"

RPROVIDES:${PN} += "python3-PyQt6-DataVisualization \
python3-qtdatavisualization-qt6 \
python3.13dist-pyqt6-datavisualization \
python313-PyQt6-DataVisualization \
python313-qtdatavisualization-qt6 \
python3dist-pyqt6-datavisualization"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-PyQt6 \
python313-PyQt6-sip"

inherit rpm
