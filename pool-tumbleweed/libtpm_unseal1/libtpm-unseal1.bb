SUMMARY = "Management tools for the TPM hardware (library)"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm-tools package \
provides tools for enablement and configuration of the TPM and \
associated interfaces. Also look inside the trousers package for more \
software for TC. \
 \
This package contains shared libraries"
LICENSE = "IPL-1.0"

PV = "1.3.9.2"

RPM_NAME = "libtpm_unseal1-1.3.9.2-3.16.aarch64.rpm"
RPM_HASH = "8cd0a89c6639891b1136844324a56aece3b66a60d307e9d7aa4d07902450db4cadb9fa3a18a8d866ebbcd398ae7d6f82325149f1a5eac1338ff5ae790ca5232a"

RPROVIDES:${PN} += "libtpm-unseal.so.1 \
libtpm-unseal1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtspi.so.1"

inherit rpm
