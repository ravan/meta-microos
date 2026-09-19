SUMMARY = "Python bindings for the Qt Graphs library"
DESCRIPTION = "PyQt6-Graphs is a set of Python bindings for The Qt Company's Qt Graphs framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-Graphs-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "7b453a3a351861a144fc94f9778ed5b2d90013c81b2e7d7a48e87a384dafb572e1e86c368353fa6b1f62e46460cc068db789a4f5f0266c57bd63881d5a54a263"

RPROVIDES:${PN} += "python3.14dist-pyqt6-graphs \
python314-PyQt6-Graphs \
python314-qtgraphs-qt6 \
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
python314-PyQt6 \
python314-PyQt6-sip"

inherit rpm
