SUMMARY = "Device tree library"
DESCRIPTION = "libfdt is a library to process Open Firmware style device trees on various \
architectures."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "libfdt1-1.7.2-2.5.aarch64.rpm"
RPM_HASH = "8e730363fba41c4ad79137ab2f5ad1d17393d557acd9d53c24be2ea2cff256f851c58b12e9c5f4fb2b0e6121e2ec91e8a16adbd1bbc3c8dfc2a7ce84b60716c7"

RPROVIDES:${PN} += "libfdt.so.1 \
libfdt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
