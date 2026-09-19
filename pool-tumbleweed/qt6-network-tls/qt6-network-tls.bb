SUMMARY = "Backends used to handle secure connections"
DESCRIPTION = "TLS (and non-TLS) plugins used by the QSsl classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-network-tls-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "8d9e299b5010e49626fdf59045d6b636bdacb69bdf62ca90391fa9d05d536c3226a0dad77c53eba5ac23805c312081b4ef6fcc33d7a26c2bde03ecec2ed351e8"

RPROVIDES:${PN} += "libqcertonlybackend.so \
libqopensslbackend.so \
qt6-network-tls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
