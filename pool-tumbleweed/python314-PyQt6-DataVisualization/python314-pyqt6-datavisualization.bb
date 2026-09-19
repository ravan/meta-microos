SUMMARY = "Python bindings for the Qt Data Visualization library"
DESCRIPTION = "PyQt6-DataVisualization is a set of Python bindings for The Qt Company’s Qt DataVisualization framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-DataVisualization-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "705dfc1efc79cc52028febf2177d5ea2f9c4619de6a1e9b724700c3a34995129fa89c97bba0c372936916cf0399ecab069a674a4cdd5a8d45b35fc2b82a84e78"

RPROVIDES:${PN} += "python3.14dist-pyqt6-datavisualization \
python314-PyQt6-DataVisualization \
python314-qtdatavisualization-qt6 \
python3dist-pyqt6-datavisualization"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-PyQt6 \
python314-PyQt6-sip"

inherit rpm
