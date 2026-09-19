SUMMARY = "Qt 6 Network library"
DESCRIPTION = "Qt Network provides a set of APIs for programming applications that \
use TCP/IP. Operations such as requests, cookies, and sending data \
over HTTP are handled by various C++ classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Network6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "d9c65b67fd4ad8bf3fdae83715edf6215a912d4be9708b3474baf55115abe61c2fa06e45fd42ecf76c000952fe76fa421c423929a47d1f11db840d02b337dd1a"

RPROVIDES:${PN} += "libQt6Network.so.6 \
libQt6Network6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libQt6DBus6 \
libbrotlidec.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libproxy.so.1 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1 \
qt6-network-tls \
qt6-networkinformation-connman \
qt6-networkinformation-glib \
qt6-networkinformation-nm"

inherit rpm
