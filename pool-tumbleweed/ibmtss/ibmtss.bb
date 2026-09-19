SUMMARY = "IBM's TPM 2.0 TSS"
DESCRIPTION = "This is a user space TCG Software Stack (TSS) for TPM 2.0. It \
implements the functionality equivalent to the TCG TSS working \
group's planned ESAPI, SAPI, and TCTI APIs. \
 \
It comes with over 100 'TPM tools' that can be used for scripted \
apps, rapid prototyping, education, and debugging."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "ibmtss-2.4.1-2.5.aarch64.rpm"
RPM_HASH = "1ef31ad527595e9fd4e58d514d48efd1d1047bde07178f8f0ae667c58f9cd83e74eebe371112c887cca29a3b63747602357ff27c1907bdb13590b2f3e7c4835a"

RPROVIDES:${PN} += "ibmtss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libibmtss.so.2 \
libibmtssutils.so.2"

inherit rpm
