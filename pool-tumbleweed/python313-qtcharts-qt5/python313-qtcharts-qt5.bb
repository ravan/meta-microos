SUMMARY = "Python bindings for the Qt5 Charts library"
DESCRIPTION = "PyQtChart is a set of Python bindings for the Qt5 Charts library."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python313-qtcharts-qt5-5.15.6-5.8.aarch64.rpm"
RPM_HASH = "5678adf029ca7f32c9497a08f46bbeb32174502ac80ea62fdf027108fd40eb6d07296e648943db8c60cad361499f21424d094ee71d036676c1e276eb4bc9d375"

RPROVIDES:${PN} += "python3-PyQtChart \
python3-qtcharts-qt5 \
python3.13dist-pyqtchart \
python313-PyQtChart \
python313-qtcharts-qt5 \
python3dist-pyqtchart"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-qt5 \
python313-qt5-sip"

inherit rpm
