SUMMARY = "Shared library for IBM's TPM 2.0 TSS"
DESCRIPTION = "Shared library for IBM's TPM 2.0 TSS tools"
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "libibmtss2-2.4.1-2.5.aarch64.rpm"
RPM_HASH = "c6e1aa40c2f4b9e7766b6d1eb52e1ad3a87482dd2b38745492b493bc4c05f80c9e15e753cd76e076c97bd4a6adf191c95ab359902966a88e4fb8bdaba73187bd"

RPROVIDES:${PN} += "libibmtss.so.2 \
libibmtss2 \
libibmtssutils.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
