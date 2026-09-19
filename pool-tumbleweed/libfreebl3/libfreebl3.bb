SUMMARY = "Freebl library for the Network Security Services"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards. \
 \
This package installs the freebl library from NSS."
LICENSE = "MPL-2.0"

PV = "3.127"

RPM_NAME = "libfreebl3-3.127-1.1.aarch64.rpm"
RPM_HASH = "0f25075e18bfecc62c180d258f1fa852b5af1a1d755cd096a7ac6bd3f73afd4a9daf92e7f3ea85758ca3c2d39adb422f68461585031eb67b5c159b3be7adfadc"

RPROVIDES:${PN} += "libfreebl3 \
libfreebl3-hmac \
libfreebl3.so \
libfreeblpriv3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
