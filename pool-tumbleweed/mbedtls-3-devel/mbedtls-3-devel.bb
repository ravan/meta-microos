SUMMARY = "Development files for mbedtls, a SSL/TLS library"
DESCRIPTION = "This subpackage contains the development files for mbedtls, \
a suite of libraries for cryptographic functions and the \
SSL/TLS protocol suite."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "3.6.7"

RPM_NAME = "mbedtls-3-devel-3.6.7-1.2.aarch64.rpm"
RPM_HASH = "075459d65cb1d0c28b1efb07cb7ccec6643df550a50c71c982ab61f1fe701728be5a2cde336ed6094b115cd4243fc9e98a29dd93db304b7b7f707aff597c19a0"

RPROVIDES:${PN} += "cmake-MbedTLS \
mbedtls-3-devel \
mbedtls-devel \
pkgconfig-mbedcrypto \
pkgconfig-mbedtls \
pkgconfig-mbedx509"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libeverest \
libmbedcrypto16 \
libmbedtls21 \
libmbedx509-7 \
libp256m \
pkgconfig-mbedcrypto \
pkgconfig-mbedx509"

inherit rpm
