SUMMARY = "A graphical tool to resize bitmaps in high quality"
DESCRIPTION = "SmillaEnlarger is a small graphical tool ( based on Qt ) to resize, \
especially magnify bitmaps in high quality."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0+git.2017.11.21"

RPM_NAME = "smillaenlarger-0.9.0+git.2017.11.21-2.12.aarch64.rpm"
RPM_HASH = "01c2275ee989545a598f9066e64bc16d8733947bedd74f73389548d201f696c8cc2dd505347b8b87d7f6c1e32dfeaa4b9d0722aab8c58674fdeae1249106f05b"

RPROVIDES:${PN} += "smillaenlarger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
