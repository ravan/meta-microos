SUMMARY = "Trusted Platform Module (TPM) remote attestation tools"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm-quote-tools package \
provides additional tools that employ the TPM quote command to facilitate \
remote attestation. These tools are based on the trousers TPM 1.2 stack."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "tpm-quote-tools-1.0.4-1.32.aarch64.rpm"
RPM_HASH = "96fb2696e08af0eb53bf9708d90362226e05e47f71b12fa47edd21de097c513bf1f4456a524223ad5154678358e6e5d3747683efcbe808f01f32f1bebeeef5f9"

RPROVIDES:${PN} += "tpm-quote-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtspi.so.1"

inherit rpm
