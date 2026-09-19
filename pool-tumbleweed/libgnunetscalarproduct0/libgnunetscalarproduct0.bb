SUMMARY = "GNUnet library libgnunetscalarproduct"
DESCRIPTION = "This package contains the libgnunetscalarproduct library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetscalarproduct0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "03f043a090deb759701fb283b400cc19725550245f078a4007f36142797207562ed65e2d5f8b845d7b6f84b925ee6091d80c2b46943c6a42a871ac5856ba7a8a"

RPROVIDES:${PN} += "libgnunetscalarproduct.so.0 \
libgnunetscalarproduct0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnunetutil.so.20"

inherit rpm
