SUMMARY = "Qt6 WebEngineWidgets library"
DESCRIPTION = "The Qt6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6WebEngineWidgets6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "08ca692652b0a7181b9d3de2b3cda31626b0bae310e42237b40204dad9993a0cdfc136fc7838916f218fe8d1cde7aca79ce602feab5bc3aa3a9b335cf8b1a15b"

RPROVIDES:${PN} += "libQt6WebEngineWidgets.so.6 \
libQt6WebEngineWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6WebEngineCore.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
