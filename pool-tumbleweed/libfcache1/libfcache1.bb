SUMMARY = "Library to provide generic file data cache functions"
DESCRIPTION = "Library to provide generic file data cache functions for the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260520"

RPM_NAME = "libfcache1-20260520-1.6.aarch64.rpm"
RPM_HASH = "72a91d0ad500d4b3149c1ee4a8cc8be06e4ec71beb55caf77206d8471a2ea6a7e804be154a34e32f430d6853ea2cfe1f6e771bbe18463660bdf90ae53c4e269e"

RPROVIDES:${PN} += "libfcache.so.1 \
libfcache1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1"

inherit rpm
