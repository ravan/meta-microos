SUMMARY = "Trusted Platform Module (TPM) 2.0 administration tools"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm2.0-tools package \
provides tools for enablement and configuration of the TPM 2.0 and \
associated interfaces."
LICENSE = "BSD-3-Clause"

PV = "5.7"

RPM_NAME = "tpm2.0-tools-5.7-3.3.aarch64.rpm"
RPM_HASH = "80995f1e6761709fef56f5967fda4c0454e8ce0a5ebaa854f8ee41af83e1a8f59ca8ee7515b75bae4e643ac4101bc3b2af24784aab38b14ac97a48f5bed151c0"

RPROVIDES:${PN} += "tpm2.0-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libefivar.so.1 \
libtss2-esys.so.0 \
libtss2-fapi.so.1 \
libtss2-mu.so.0 \
libtss2-rc.so.0 \
libtss2-sys.so.1 \
libtss2-tctildr.so.0"

inherit rpm
