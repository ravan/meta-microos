SUMMARY = "Qt6 qhexedit2 library"
DESCRIPTION = "Qt6 library for qhexedit2."
LICENSE = "LGPL-2.0-only"

PV = "0.9.0"

RPM_NAME = "libqhexedit0-0.9.0-1.6.aarch64.rpm"
RPM_HASH = "3468cd6ad04f845de73e46f17acae138133b19e692b1fc9b833c85baa271bd3da9c3204bf17310cf2f9cce2233069c933e2cbc443cec2f4f1c8729c32dad6fa9"

RPROVIDES:${PN} += "libqhexedit.so.0 \
libqhexedit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
