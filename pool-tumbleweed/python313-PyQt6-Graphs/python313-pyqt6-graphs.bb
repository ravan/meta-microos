SUMMARY = "Python bindings for the Qt Graphs library"
DESCRIPTION = "PyQt6-Graphs is a set of Python bindings for The Qt Company's Qt Graphs framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-Graphs-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "eae31d465e1a1108fcf37e3bdd0db9b8a6e64bbcad5db45838dff5d6a78012d434621d283e50f6519f1e644590f98cf37e17d64c876683884a7b1a1e5666539f"

RPROVIDES:${PN} += "python3-PyQt6-Graphs \
python3-qtgraphs-qt6 \
python3.13dist-pyqt6-graphs \
python313-PyQt6-Graphs \
python313-qtgraphs-qt6 \
python3dist-pyqt6-graphs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Graphs.so.6 \
libQt6GraphsWidgets.so.6 \
libQt6Gui.so.6 \
libQt6Quick3D.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-PyQt6 \
python313-PyQt6-sip"

inherit rpm
