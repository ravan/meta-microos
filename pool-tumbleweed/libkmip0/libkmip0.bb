SUMMARY = "ISO C11 implementation of the Key Management Interoperability Protocol"
DESCRIPTION = "libkmip is an ISO C11 implementation of the Key Management \
Interoperability Protocol (KMIP), an OASIS communication standard \
for the management of objects stored and maintained by key \
management systems. KMIP defines how key management operations \
and operation data should be encoded and communicated, between \
client and server applications. Supported operations include \
creating, retrieving, and destroying keys. Supported object types \
include symmetric and asymmetric encryption keys. \
 \
For more information on KMIP, check out the OASIS KMIP Technical \
Committee and the OASIS KMIP Documentation. \
 \
This package contains the shared library."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "libkmip0-0.2.0-1.18.aarch64.rpm"
RPM_HASH = "10dd08f6f0424e7d6680fc56f4ed1b077a65df0ae1468f3bfea88c4dbbed5affc2e5213c0644e17dd60a71f1efdea0048c1bf335464499b84fce6151a91a5ff2"

RPROVIDES:${PN} += "libkmip.so.0 \
libkmip0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
