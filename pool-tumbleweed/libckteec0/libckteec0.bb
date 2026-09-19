SUMMARY = "Library implementing the PKCS11 API"
DESCRIPTION = "This component provides the PKCS11 API using the PKCS11 trusted \
application executing in OP-TEE.For a general overview of OP-TEE, the \
Open Platform Trusted Execution Environment, see the Notice.md file."
LICENSE = "BSD-2-Clause"

PV = "4.6.0"

RPM_NAME = "libckteec0-4.6.0-1.6.aarch64.rpm"
RPM_HASH = "4e8aff4ab3232abf06d4d690c5b6c8c31b8ce3e6c4727909399aa886a7030b8279e4292d4accab3f59832308a259086c2809c756c9970194ca2f1e974cba615c"

RPROVIDES:${PN} += "libckteec.so.0 \
libckteec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libteec.so.2"

inherit rpm
