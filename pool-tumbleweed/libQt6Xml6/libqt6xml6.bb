SUMMARY = "Qt 6 XML library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Xml6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "6c8e776f17d9d4e29bdd2584a084ee966a89b88e8ad45b101e5b724f10ed5667307d34cf4edfac526fe1bc5eb54b31022dbce088b0efb6cd668ddacdb1eed9c4"

RPROVIDES:${PN} += "libQt6Xml.so.6 \
libQt6Xml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
