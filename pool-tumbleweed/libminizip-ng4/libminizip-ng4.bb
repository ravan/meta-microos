SUMMARY = "Companion library to zlib-ng for reading and writing ZIP files"
DESCRIPTION = "minizip-ng is a ZIP file manipulation library. \
 \
It has support for: \
* Basic read-write operation on zip archives (adding files and removing \
  files) on a high-level and also raw zip entry data \
* ZIP64 extension for large files \
* Zlib, BZIP2, LZMA, XZ, and ZSTD compression methods \
* PKWARE- and Winzip-AES styles password protection \
* NTFS timestamp support for UTC last modified, last accessed, and creation dates \
* zip archive splitting \
* Follow/store symbolic links \
* UTF-8, cp437, cp932, cp936 and cp950 filename character set support"
LICENSE = "Zlib"

PV = "4.1.0"

RPM_NAME = "libminizip-ng4-4.1.0-1.3.aarch64.rpm"
RPM_HASH = "c865f4c0778af48ad36b6469e6625da77059b685c546b2162da6e4cf6665eced8e20880d5d2ababf3e12abea9ee104bf3039d54d82d51c02df8b991a976f1088"

RPROVIDES:${PN} += "libminizip-ng.so.4 \
libminizip-ng4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzma.so.5 \
libz-ng.so.2 \
libzstd.so.1"

inherit rpm
