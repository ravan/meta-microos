SUMMARY = "GuardTime KSI API"
DESCRIPTION = "LibKSI - Keyless Signature Infrastructure GuardTime client library"
LICENSE = "Apache-2.0"

PV = "3.21.3087"

RPM_NAME = "libksi13-3.21.3087-1.8.aarch64.rpm"
RPM_HASH = "225245dcc00a86daff75af3be677b18fa6ee655307c9ddd4e1071880c4aba67178e3f81479a562b8d035782d5bde367eed186f7862bb40227fada7e555cbd64d"

RPROVIDES:${PN} += "libksi.so.13 \
libksi13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4"

inherit rpm
