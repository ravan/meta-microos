SUMMARY = "Trusted Platform Module (TPM) administration tools"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm-tools package \
provides tools for enablement and configuration of the TPM and \
associated interfaces. Also look inside the trousers package for more \
software for TC."
LICENSE = "IPL-1.0"

PV = "1.3.9.2"

RPM_NAME = "tpm-tools-1.3.9.2-3.16.aarch64.rpm"
RPM_HASH = "7445cabf69ac9d6f0a8fe6c9368e6fbc42cb70a252e2e019273306732c89650edb22b43f7709eb9914d7447fd0057a1d3a1cd2d494912d2a1df8f52c11f84ea2"

RPROVIDES:${PN} += "tpm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtpm-unseal.so.1 \
libtspi.so.1"

inherit rpm
