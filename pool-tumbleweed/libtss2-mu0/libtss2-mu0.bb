SUMMARY = "TPM2 marshaling/unmarshaling library"
DESCRIPTION = "Marshaling/Unmarshaling (MU) as described in the TCG TSS 2.0 \
Marshaling/Unmarshaling API Specification. This API provides a set of \
marshaling and unmarshaling functions for all data types defined by the TPM \
library specification."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-mu0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "8fee4f31687e93ddc15ccd7d2577eb7d59b5de35992109940513cf349f023b4a46263e37dfd27b2d18b81589d4f16f6d9a43daf04c04bd785ccda904f816339d"

RPROVIDES:${PN} += "libtss2-mu.so.0 \
libtss2-mu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
