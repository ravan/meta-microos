SUMMARY = "Qt 5 Network Library"
DESCRIPTION = "Qt Network provides a set of APIs for programming applications that \
use TCP/IP. Operations such as requests, cookies, and sending data \
over HTTP are handled by various C++ classes."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Network5-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "957eff48e54ac2f37fbc36b382be5757878d794508ce7503cee0b4455abc112ad66082d8676c3f61c3edf2a7a13e06836778e21006d256a7be003dc70e843ae7"

RPROVIDES:${PN} += "libQt5Network.so.5 \
libQt5Network5 \
libqconnmanbearer.so \
libqgenericbearer.so \
libqnmbearer.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libc.so.6 \
libcrypto.so.3 \
libproxy.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
