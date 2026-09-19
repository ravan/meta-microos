SUMMARY = "Qt 6 Widgets library"
DESCRIPTION = "The Qt Widgets library provides a set of UI elements to create classic \
desktop-style user interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Widgets6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "e8dbd7cebac87b5e5192bf57856cc012c1198039e9ae2df14e25070c95eb80355247a7e7ab73e62d3bda5db638f4239731fb40837274ed0b4773d7cb59cd93d5"

RPROVIDES:${PN} += "libQt6Widgets.so.6 \
libQt6Widgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Gui6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
