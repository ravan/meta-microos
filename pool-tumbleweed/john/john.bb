SUMMARY = "Utility to detect weak passwords"
DESCRIPTION = "John the Ripper is a password cracker (password security auditing \
tool). Its primary purpose is to detect weak passwords, and a \
number of other hash types are supported to that end."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "john-1.9.0-9.24.aarch64.rpm"
RPM_HASH = "cc47e5146c2ea05bbbe84547bdafd9b3f20b3cea088bc5582d51b7e79d81ea2b5a210db9b6e547345e275c69c0ea1353125ea73ab37f875de0a0da9aeb1df3d6"

RPROVIDES:${PN} += "config-john \
john"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
group-users \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libgmp.so.10 \
libm.so.6 \
libpcap.so.1 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
