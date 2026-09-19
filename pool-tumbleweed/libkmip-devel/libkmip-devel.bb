SUMMARY = "Header files for the Key Management Interoperability Protocol library"
DESCRIPTION = "libkmip is an ISO C11 implementation of the Key Management \
Interoperability Protocol (KMIP), an OASIS communication standard \
for the management of objects stored and maintained by key \
management systems. \
 \
This package contains the development headers and libraries."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "libkmip-devel-0.2.0-1.18.aarch64.rpm"
RPM_HASH = "7ee60dce68a5228491ca94892d727c61e02260c4d9a29afecda443d952cc3c897a385b8c1f5efe8f1b84cfc01bd205c6126400feb58ceba6e2133adb5f78d7ac"

RPROVIDES:${PN} += "libkmip-devel"

RDEPENDS:${PN} += "libkmip0"

inherit rpm
