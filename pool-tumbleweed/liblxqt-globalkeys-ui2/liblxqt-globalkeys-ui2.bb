SUMMARY = "UI lxqt-globalkeys libraries"
DESCRIPTION = "UI system libraries for lxqt-globalkeys"
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "liblxqt-globalkeys-ui2-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "c3e675e67a021e0d17ad1b6dc8e3c2373ab9eae74e40e658d790c325c64fcd2854c0287b8de8cbdd477477d5111cabf56c22cef5b9acd3e8628d9c87f3dac381"

RPROVIDES:${PN} += "liblxqt-globalkeys-ui.so.2 \
liblxqt-globalkeys-ui2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
liblxqt-globalkeys.so.2 \
libstdc++.so.6"

inherit rpm
