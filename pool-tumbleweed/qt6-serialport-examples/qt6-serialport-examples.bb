SUMMARY = "Examples for the qt6-serialport modules"
DESCRIPTION = "Examples for the qt6-serialport modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-serialport-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "23a5713a57bee5b45be756ac29fc77ed6e8e111d51e209003b5dfc08d8da8c003c026d39a79eac195dc62a3a57a2aa0d69fe84ebb481fe28ce5e8e366c80c153"

RPROVIDES:${PN} += "qt6-serialport-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6SerialPort.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
