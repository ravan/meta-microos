SUMMARY = "Files to use the library routines supplied with tpm-tools"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm-tools package \
provides tools for enablement and configuration of the TPM and \
associated interfaces. Also look inside the trousers package for more \
software for TC. \
 \
This package contains the libraries and headers necessary for developing \
tpm-tools applications."
LICENSE = "IPL-1.0"

PV = "1.3.9.2"

RPM_NAME = "tpm-tools-devel-1.3.9.2-3.16.aarch64.rpm"
RPM_HASH = "94088a77d60a7b20e9a66cb856c9ac0e55c814d3eddd134eb3f6c38ecf2647a3c4ee3aa21bc5cfb958ec104688637b7144fe4498fe01c265f583632acec0dddf"

RPROVIDES:${PN} += "tpm-tools-devel"

RDEPENDS:${PN} += "libtpm-unseal1"

inherit rpm
