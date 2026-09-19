SUMMARY = "Qt5 PDF library"
DESCRIPTION = "Main library of the Qt PDF module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.19"

RPM_NAME = "libQt5Pdf5-5.15.19-3.3.aarch64.rpm"
RPM_HASH = "6e71a69efc5b765a810d306b712e72e014d7d6338e75ca8e679d1b154b4426616016c15bd3256b137ce3ecd07fa172d0cd3b01fb71cd00ef04722c21a6e3d005"

RPROVIDES:${PN} += "libQt5Pdf.so.5 \
libQt5Pdf5 \
libqpdf.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libfreetype.so.6 \
libjpeg.so.8 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
