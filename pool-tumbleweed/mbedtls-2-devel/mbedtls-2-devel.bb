SUMMARY = "Development files for mbedtls, a SSL/TLS library"
DESCRIPTION = "This subpackage contains the development files for mbedtls, \
a suite of libraries for cryptographic functions and the \
SSL/TLS protocol suite."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "2.28.10"

RPM_NAME = "mbedtls-2-devel-2.28.10-5.1.aarch64.rpm"
RPM_HASH = "b2647943bdc784c4142dd481b1742fb31462b3aed5b7d25ed8bf14f1234106bb937b2dc12fad4eb380aa9e9e0e4b81e51ec17c58967c39cb138471a4066424c3"

RPROVIDES:${PN} += "mbedtls-2-devel \
mbedtls-devel \
pkgconfig-mbedcrypto \
pkgconfig-mbedtls \
pkgconfig-mbedx509"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmbedcrypto7 \
libmbedtls14 \
libmbedx509-1 \
pkgconfig-mbedcrypto \
pkgconfig-mbedx509"

inherit rpm
