SUMMARY = "Yubikey NEO PIV applet library"
DESCRIPTION = "This is a low-level library to interact the PIV applet on a YubiKey NEO"
LICENSE = "BSD-2-Clause"

PV = "2.7.3"

RPM_NAME = "libykpiv2-2.7.3-1.3.aarch64.rpm"
RPM_HASH = "a86c4ceb125ffa0e4ebde68a11012b6d9663eb047d162d84993e84cafcabb64c6487de839aeb6aa1e5aaf5d31247b03905e009987f51102b81f5c506642e22cc"

RPROVIDES:${PN} += "libykpiv.so.2 \
libykpiv2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcsclite.so.1 \
libz.so.1 \
pcsc-ccid"

inherit rpm
