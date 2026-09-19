SUMMARY = "Tools for the Key Management Interoperability Protocol"
DESCRIPTION = "libkmip is an ISO C11 implementation of the Key Management \
Interoperability Protocol (KMIP), an OASIS communication standard \
for the management of objects stored and maintained by key \
management systems. KMIP defines how key management operations \
and operation data should be encoded and communicated, between \
client and server applications. Supported operations include \
creating, retrieving, and destroying keys. Supported object types \
include symmetric and asymmetric encryption keys. \
 \
This package contains various tools."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "libkmip-tools-0.2.0-1.18.aarch64.rpm"
RPM_HASH = "3dc2d7f5df04e54f12d60576a76e1d6b426cfbab8049da7fa35c622c245cf06cac39b57a392aa248958d537c2cfcf0889c36e51b54d408fbb0ad1560944e45ac"

RPROVIDES:${PN} += "libkmip-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
