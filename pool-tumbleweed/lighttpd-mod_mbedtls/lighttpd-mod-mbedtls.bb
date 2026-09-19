SUMMARY = "TLS module for lighttpd that uses mbedTLS"
DESCRIPTION = "TLS module for lighttpd that uses mbedTLS."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_mbedtls-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "d2c7c8fc8ba3fc9496f2beaf14bbb35a477ccc1cb1fe4debcc0ef054b1bf3fe0e4c116dda52303de1e9dd7113833d0f52c7e28327e7d659d4a79ee6a51f81be3"

RPROVIDES:${PN} += "lighttpd-mod-mbedtls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedtls.so.23 \
libmbedx509.so.9 \
libtfpsacrypto.so.2 \
lighttpd"

inherit rpm
