SUMMARY = "Devel files for tpm2-tss-engine"
DESCRIPTION = "Development files for tpm2-tss-engine, an OpenSSL engine for TPM2 devices. \
 \
The tpm2-tss-engine project implements a cryptographic engine for OpenSSL for \
Trusted Platform Module (TPM 2.0) using the tpm2-tss software stack that follows \
the Trusted Computing Groups (TCG) TPM Software Stack (TSS 2.0). It uses the \
Enhanced System API (ESAPI) interface of the TSS 2.0 for downwards communication. \
It supports RSA decryption and signatures as well as ECDSA signatures."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "tpm2-tss-engine-devel-1.2.0-3.9.aarch64.rpm"
RPM_HASH = "23bed31c6b7eed0a953a6f56957144f247bbe03f862007739e01f4431b9a1893463406c6fa295bebaad52edb6d1691761ecb2e3f9c8964c74326aa60aaa318a6"

RPROVIDES:${PN} += "tpm2-tss-engine-devel"

RDEPENDS:${PN} += "tpm2-tss-engine"

inherit rpm
