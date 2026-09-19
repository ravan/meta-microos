SUMMARY = "TPM2 Enhanced System API (ESAPI)"
DESCRIPTION = "This API is a 1-to-1 mapping of the TPM2 commands documented in Part 3 of the \
TPM2 specification. Additionally there are asynchronous versions of each \
command. In addition to SAPI, the ESAPI performs tracking of meta data for \
TPM object and automatic calculation of session based authorization and \
encryption values. Both the synchronous and asynchronous API are exposed \
through this library."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-esys0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "b641f581f76acdf481f8181349d629d2b9a9dd724918a2d11e90ce233a1dd30d4534921ad9cfd9bf369e9a7f5a9c6110db2a27e8ee863a52d364ecc1bfe09219"

RPROVIDES:${PN} += "libtss2-esys.so.0 \
libtss2-esys0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtss2-mu.so.0 \
libtss2-sys.so.1"

inherit rpm
