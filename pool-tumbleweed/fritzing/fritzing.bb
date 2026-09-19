SUMMARY = "Electronic Design Automation platform featuring prototype to product"
DESCRIPTION = "Fritzing is an initiative to support designers, artists, \
researchers and hobbyists to take the step from physical prototyping \
to an actual product. It is in the spirit of Processing and Arduino which \
allow users to document their Arduino and other electronic-based \
prototypes, and to create a PCB layout for manufacturing."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "fritzing-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "928c07696e14929d0ca9fcaf4c51bdc64b56c5d7b4372d7856d2e878cecc70bad7a51c95312efa429ab399950d5236f7aa6f2443dd73ccbef64df279401ab42c"

RPROVIDES:${PN} += "fritzing"

RDEPENDS:${PN} += "desktop-file-utils \
fritzing-parts \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6PrintSupport.so.6 \
libQt6SerialPort.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpolyclipping.so.22 \
libquazip1-qt6.so.1.7 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
