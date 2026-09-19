SUMMARY = "Qt 5 Designer Library"
DESCRIPTION = "The Qt 5 Designer library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde3"

RPM_NAME = "libQt5Designer5-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "612b97261aab3a6b7114e7d2eb5bce5d6f05c5480103668484513f89b2faade1e1b9392daae654e9e652bedb30369669925576b53aea16f1b80999d5ecb155d4"

RPROVIDES:${PN} += "libQt5Designer.so.5 \
libQt5Designer5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQt5Xml.so.5 \
libQt5Xml5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
