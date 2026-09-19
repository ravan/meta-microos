SUMMARY = "Qt6 Pdf library"
DESCRIPTION = "The Qt6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Pdf6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d5fddacea3884546bf1bfd6cd509245430a6a4ad911b32c63306fa3efb58ad0e5b2f0a87cf3e9b3f82698fffb4688bedd390573d090b522ccd08aef70cbbd7b2"

RPROVIDES:${PN} += "libQt6Pdf.so.6 \
libQt6Pdf6 \
libqpdf.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libm.so.6 \
libopenjp2.so.7 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
