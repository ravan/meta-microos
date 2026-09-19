SUMMARY = "Development files for openCryptoki, a PKCS#11 implementation for IBM hardware"
DESCRIPTION = "The PKCS#11 version 2.01 API implemented for the IBM cryptographic \
cards. This package includes support for the IBM 4758 cryptographic \
co-processor (with the PKCS#11 firmware loaded) and the IBM eServer \
Cryptographic Accelerator (FC 4960 on pSeries). \
This package contains the development header files for building \
opencryptoki and PKCS#11 based applications"
LICENSE = "CPL-1.0"

PV = "3.27.0"

RPM_NAME = "openCryptoki-devel-3.27.0-3.1.aarch64.rpm"
RPM_HASH = "1e9feae8661fc7766599a14742e25ee019ab8fc3dca1bd56ce6abd3ced7a6c3214b286329b054920c4dbd5d463938fa395fed1924d2f379481653be1cbca86cb"

RPROVIDES:${PN} += "openCryptoki-devel \
pkgconfig-opencryptoki"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libopenssl-devel \
openldap2-devel \
trousers-devel"

inherit rpm
