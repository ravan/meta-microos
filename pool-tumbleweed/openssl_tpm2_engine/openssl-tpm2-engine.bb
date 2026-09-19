SUMMARY = "OpenSSL TPM 2.0 interface engine plugin"
DESCRIPTION = "This package contains a plugin a for OpenSSL which connects it with the \
Trusted Platform Module version 2.0 found on newer machines and a \
create_tpm2_key helper binary to create and extract a TPM key."
LICENSE = "LGPL-2.1-only"

PV = "4.4.3"

RPM_NAME = "openssl_tpm2_engine-4.4.3-1.4.aarch64.rpm"
RPM_HASH = "6986fa09a42becc4dfbf84a5754984b357a2e1f1decdd025dabac1fc6fc288cc08bf630a23bf82d9be51a0d179c9c9e915d554847c2a6a195eec333dcb393e59"

RPROVIDES:${PN} += "libtpm2.so \
openssl-tpm2-engine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libibmtss.so.2"

inherit rpm
