SUMMARY = "Library to manipulate F2 filesystems"
DESCRIPTION = "This package contains a shared library used for manipulation of F2 \
filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.16.0"

RPM_NAME = "libf2fs10-1.16.0-2.6.aarch64.rpm"
RPM_HASH = "7d12ee34425f78c0476697ab0b601aa894b5fc5d5ee1be010380017f525aff2d121c0268c48e47fff13ea4e4b58cde4096234b87be05c1be01f631b7a3510cbd"

RPROVIDES:${PN} += "libf2fs.so.10 \
libf2fs10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
