SUMMARY = "Management tools using PKCS#11 for the TPM hardware"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm-tools package \
provides tools for enablement and configuration of the TPM and \
associated interfaces. Also look inside the trousers package for more \
software for TC. \
 \
This package contains group of tools that use the TPM PKCS#11 token. All data \
contained in the PKCS#11 data store is protected by the TPM (keys, \
certificates, etc.). You can import keys and certificates, list out the \
objects in the data store, and protect data."
LICENSE = "IPL-1.0"

PV = "1.3.9.2"

RPM_NAME = "tpm-tools-pkcs11-1.3.9.2-3.16.aarch64.rpm"
RPM_HASH = "c8a34c163989ac58be42446bff4f55be9833ff375df3ae4b5adf6b439cb49dcc826391e175815314c44a76492104cc797cc43ae6556aa2ddfc5b2855ae12dae3"

RPROVIDES:${PN} += "tpm-tools-pkcs11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtspi.so.1"

inherit rpm
