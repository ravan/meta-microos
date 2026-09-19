SUMMARY = "A tool for in-depth analysis of USB HID devices communication"
DESCRIPTION = "Hidviz is a GUI application for in-depth analysis of USB HID class devices. \
The 2 main usecases of this application are reverse-engineering existing \
devices and developing new USB HID devices."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.1"

RPM_NAME = "hidviz-0.2.1-1.17.aarch64.rpm"
RPM_HASH = "e96e52469f42dfbe0007ddce0b69663cc53ccc6eb47a8e9fe4777b960240377511e73f6e02fe2c41727ec5e24a93b452403cc36f158621fb51234011ffc0245d"

RPROVIDES:${PN} += "hidviz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
