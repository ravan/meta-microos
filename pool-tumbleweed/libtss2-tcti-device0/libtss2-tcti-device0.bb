SUMMARY = "TCTI interface library for using a native TPM device node"
DESCRIPTION = "TPM Command Transmission Interface library for communicating with a \
TPM device node. This provides direct access to the TPM through the Linux \
kernel driver."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-tcti-device0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "854940b696a0a6432ee7e04a879b27e0e4d291b874d5dce4c2e7b2632a0706bc48b1d60c6e8a0429ece54e605b19093c638aaa1b8695a574324e00155bef0dd3"

RPROVIDES:${PN} += "libtss2-tcti-device.so.0 \
libtss2-tcti-device0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
