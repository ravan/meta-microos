SUMMARY = "OpenSSL TPM interface engine plugin"
DESCRIPTION = "This package contains a plugin a for OpenSSL which connects it with the \
Trusted Platform Module found on newer machines and a create_tpm_key \
helper binary to create and extract a TPM key."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2"

RPM_NAME = "openssl_tpm_engine-0.4.2-9.9.aarch64.rpm"
RPM_HASH = "39412f7922b11aea34806623d676dfdd385cd6b9570c36c429c5bcbba3b7f0e5acc0bb0b18f3204a5ab7825dfbcfe2322ac65224eda3ec6aa1e7fbf89e7f3fba"

RPROVIDES:${PN} += "openssl-tpm-engine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtspi.so.1"

inherit rpm
