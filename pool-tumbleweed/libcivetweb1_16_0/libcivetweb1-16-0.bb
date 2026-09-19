SUMMARY = "Shared Object for applications that use civetweb embedded"
DESCRIPTION = "This package contains the shared library required by applications that \
are using civetweb's embeddable API to provide web services."
LICENSE = "MIT"

PV = "1.16+git1776611085.588860e3"

RPM_NAME = "libcivetweb1_16_0-1.16+git1776611085.588860e3-1.1.aarch64.rpm"
RPM_HASH = "fbeb6bc22ba851526f3a12da6a23ee60c8748fa109867b48e027f143e14735a7da03846b6a7584d75890b2e5c11e0722929894f2a122b16b5e9d2f1b214676ab"

RPROVIDES:${PN} += "libcivetweb.so.1.16.0 \
libcivetweb1-16-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
