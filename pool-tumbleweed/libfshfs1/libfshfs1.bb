SUMMARY = "Library and tools to access the Mac OS Hierarchical File System (HFS)"
DESCRIPTION = "Read-only supported HFS formats: \
 \
* HFS+, Mac OS 10.3 and later (Unicode 3.2 case-insensitive) \
* HFSX, Mac OS 10.3 and later (Unicode 3.2 case-sensitive) \
 \
Unsupported HFS formats: \
 \
* (traditional) HFS \
* HFS+, Mac OS 8.1 through 10.2 (Unicode 2.1 case-insensitive) \
* HFSX, Mac OS 8.1 through 10.2 (Unicode 2.1 case-sensitive) \
 \
Supported HFS format features: \
 \
* ZLIB (DEFLATE) compression \
* LZVN compression \
* extended attributes \
 \
Unsupported HFS format features: \
 \
* LZFSE compression, compression methods 11 and 12 \
* 'uncompressed', compression methods 1, 9 and 10"
LICENSE = "LGPL-3.0-or-later"

PV = "20260826"

RPM_NAME = "libfshfs1-20260826-1.1.aarch64.rpm"
RPM_HASH = "a344c5542c456877142a199f34ec105c0e5c3d04ae0b14b0850469b8cff9d801e9b2f08fbfb30b0cf84bfba69980adc60ddd00e297c53568ae1324129fd24e53"

RPROVIDES:${PN} += "libfshfs.so.1 \
libfshfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfmos.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm
