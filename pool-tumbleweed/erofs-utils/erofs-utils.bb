SUMMARY = "Utilities for the Extendable Read-Only Filesystem (EROFS)"
DESCRIPTION = "mkfs.erofs is a user-space tool to create erofs filesystem images. It \
can create two main types of erofs images, compressed and \
uncompressed: \
 \
* For compressed images, it is able to integrate several compression \
  algorithms, LZ4 is supported according to the current erofs kernel \
  implementation. \
* For uncompressed images, it can decide whether the last page of a \
  file should be inlined or not properly."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.3"

RPM_NAME = "erofs-utils-1.9.3-1.1.aarch64.rpm"
RPM_HASH = "17b91cb7a86080e4c7d8c8c5193461dbb75544e11bb7271b012cc4cacaa5adbe91e00d8da6dba4f8ad86a426912df88a483c047d89ff19b7ff662297606f36c1"

RPROVIDES:${PN} += "erofs-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
liblzma.so.5 \
libuuid.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
