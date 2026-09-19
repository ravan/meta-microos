SUMMARY = "Qt 6 HttpServer library"
DESCRIPTION = "QHttpServer is a simplified API for QAbstractHttpServer and QHttpServerRouter."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6HttpServer6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f82b49036c2fef41af32684f3478f975aebd9bdd8756918bcac3ba2257a55ecd6c0e1c200c56750d919c5da59e10a8804b60bf8ca24124f0802524c2342d0ca7"

RPROVIDES:${PN} += "libQt6HttpServer.so.6 \
libQt6HttpServer6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
