SUMMARY = "Library for password quality checking and generating random passwords"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "libpwquality1-1.4.5-5.9.aarch64.rpm"
RPM_HASH = "610d4d7d8f61e567422f396441992728399874b6b14918d281d3b565d24dd2e22401d8b1ccb1bb36370dc6b4cbe96bdef22e8fc4582e039381d37c6c3e924e05"

RPROVIDES:${PN} += "libpwquality \
libpwquality.so.1 \
libpwquality1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
cracklib-dict \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2"

inherit rpm
