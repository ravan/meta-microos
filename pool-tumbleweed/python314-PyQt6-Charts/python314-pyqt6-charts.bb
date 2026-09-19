SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company's Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-Charts-6.11.0-1.5.aarch64.rpm"
RPM_HASH = "56e19c08f52a9b2edfb100c4a68a273d9782135abaa255cc6af1b27b5d62ca382facb61f7d39b048a51787322a22521fcfd878fcb7d341be8732820c092059ef"

RPROVIDES:${PN} += "python3.14dist-pyqt6-charts \
python314-PyQt6-Charts \
python314-qtcharts-qt6 \
python3dist-pyqt6-charts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-PyQt6 \
python314-PyQt6-sip"

inherit rpm
