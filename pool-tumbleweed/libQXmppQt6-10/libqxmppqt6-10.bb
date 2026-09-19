SUMMARY = "Qt XMPP Library"
DESCRIPTION = "QXmpp is a cross-platform C++ XMPP client library based on Qt and C++."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.3"

RPM_NAME = "libQXmppQt6-10-1.16.3-1.3.aarch64.rpm"
RPM_HASH = "325247dd9676c819797a6546f5733b032696d4412641096a235732506c303afc1c86be4334cc0e782dc40f1e9ba01478081b3ed8af877452daccab139a717d33"

RPROVIDES:${PN} += "libQXmppOmemoQt6.so.10 \
libQXmppQt6-10 \
libQXmppQt6.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6 \
libomemo-c.so.0 \
libstdc++.so.6"

inherit rpm
