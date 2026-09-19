SUMMARY = "Qt 6 NetworkAuth library"
DESCRIPTION = "The Qt 6 NetworkAuth library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "libQt6NetworkAuth6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "534a67bc9270cebe9d8e9f59fde8cf19acba641033d28f1cc2fa50376a581947980dbf99b0ade5b758464434c8390b1e3c3b7271fdecc43295f8fc28594cd9f6"

RPROVIDES:${PN} += "libQt6NetworkAuth.so.6 \
libQt6NetworkAuth6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
