SUMMARY = "Qt 6 QuickTest library"
DESCRIPTION = "The Qt 6 QuickTest library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickTest6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "4ac3e76d3033d0d423df4f3c19aa7b102077861a670664dd10530910b7a8e9a3bc4748ccbf2aa9dc5d54f279f50b0f0e79aa9dbed698a2a7447f98fb64b69433"

RPROVIDES:${PN} += "libQt6QuickTest.so.6 \
libQt6QuickTest6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Test.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
