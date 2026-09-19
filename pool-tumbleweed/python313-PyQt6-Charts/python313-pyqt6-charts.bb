SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company's Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-Charts-6.11.0-1.5.aarch64.rpm"
RPM_HASH = "494699f62872bbeeb245559d4c930389e1e90e78745b65c8f6409c98d6690f208766e04896adc0ae304a2f4ec5bb8d1fdf276111c8eababc1cbd629c626f8d31"

RPROVIDES:${PN} += "python3-PyQt6-Charts \
python3-qtcharts-qt6 \
python3.13dist-pyqt6-charts \
python313-PyQt6-Charts \
python313-qtcharts-qt6 \
python3dist-pyqt6-charts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-PyQt6 \
python313-PyQt6-sip"

inherit rpm
