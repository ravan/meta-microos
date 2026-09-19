SUMMARY = "Libmpv wrapper for QtQuick2 and QML"
DESCRIPTION = "MpvQt is a libmpv wrapper for QtQuick2 and QML."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libMpvQt3-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "fdfe09f2b597b51203e93a0e8903380416c83102ca36eb0da0ccf301d0bd27b7d8b28fef413bb772c7ed3e64dc1723664a50d56e7c0b977de0c6066d8e13f47c"

RPROVIDES:${PN} += "libMpvQt.so.3 \
libMpvQt3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libmpv.so.2 \
libstdc++.so.6"

inherit rpm
