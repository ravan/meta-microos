SUMMARY = "OpenSSL Engine for TPM2 devices"
DESCRIPTION = "The tpm2-tss-engine project implements a cryptographic engine for OpenSSL for \
Trusted Platform Module (TPM 2.0) using the tpm2-tss software stack that follows \
the Trusted Computing Groups (TCG) TPM Software Stack (TSS 2.0). It uses the \
Enhanced System API (ESAPI) interface of the TSS 2.0 for downwards communication. \
It supports RSA decryption and signatures as well as ECDSA signatures."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "tpm2-tss-engine-1.2.0-3.9.aarch64.rpm"
RPM_HASH = "10a9f82190546a067996257fc3f9edf02557da8a218f188a10435f90fba004efff82352f245f5c53517eaa848d96f1a6288850e7d6142cbeeb4718060c12929d"

RPROVIDES:${PN} += "libtpm2tss.so \
tpm2-tss-engine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtss2-esys.so.0 \
libtss2-mu.so.0 \
libtss2-tctildr.so.0"

inherit rpm
