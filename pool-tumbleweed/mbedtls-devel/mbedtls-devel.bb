SUMMARY = "Development files for mbedtls, a SSL/TLS library"
DESCRIPTION = "This subpackage contains the development files for mbedtls, \
a suite of libraries for cryptographic functions and the \
SSL/TLS protocol suite."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "mbedtls-devel-4.2.0-1.2.aarch64.rpm"
RPM_HASH = "59b5dbf6268aa699a88496bb20117958d0a7493b880658cc646b514a6678d6a08763dbb03b82b8553b4d3af4b336b3979116a5a67891fedcb66acfb70eaec2f4"

RPROVIDES:${PN} += "cmake-MbedTLS \
cmake-TF-PSA-Crypto \
mbedtls-devel \
pkgconfig-mbedcrypto \
pkgconfig-mbedtls \
pkgconfig-mbedx509 \
pkgconfig-tfpsacrypto"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmbedtls23 \
libmbedx509-9 \
libtfpsacrypto2 \
pkgconfig-mbedcrypto \
pkgconfig-mbedx509"

inherit rpm
