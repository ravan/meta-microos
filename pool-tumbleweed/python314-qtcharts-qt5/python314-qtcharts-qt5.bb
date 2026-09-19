SUMMARY = "Python bindings for the Qt5 Charts library"
DESCRIPTION = "PyQtChart is a set of Python bindings for the Qt5 Charts library."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python314-qtcharts-qt5-5.15.6-5.8.aarch64.rpm"
RPM_HASH = "bc169a5863779569dc90df1e4b041aef4c3bbc9af83bd7bd11bbda469d044f4655f020b10cbb8158ec9d06de0487628fe45f567d93a4a8e18095f6b9524516e6"

RPROVIDES:${PN} += "python3.14dist-pyqtchart \
python314-PyQtChart \
python314-qtcharts-qt5 \
python3dist-pyqtchart"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-qt5 \
python314-qt5-sip"

inherit rpm
