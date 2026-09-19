SUMMARY = "Library and tools to access the Apple File System (APFS)"
DESCRIPTION = "libfsapfs is a library to access the Apple File System (APFS). \
 \
Read-only supported APFS formats: \
 \
* version 2 \
 \
Supported APFS format features: \
 \
* ZLIB (DEFLATE) compression \
* LZVN compression \
* encryption \
 \
Unsupported APFS format features: \
 \
* APFS version 1 \
* Fusion drive (NX_INCOMPAT_FUSION) \
* snapshots \
* LZFSE compression, compression methods 11 and 12 \
* 'uncompressed', compression methods 1, 9 and 10 \
* T2 encryption"
LICENSE = "LGPL-3.0-only"

PV = "20240429"

RPM_NAME = "python313-libfsapfs-20240429-2.21.aarch64.rpm"
RPM_HASH = "54d4157c82c349e8c87b27132e4b1161ffe600efe01c701cd4f84c4b30ae54fa5deb8208149f5934febbc415a8c8b4da532a13bff6a7ebee8374451321ed277a"

RPROVIDES:${PN} += "python3-libfsapfs \
python313-libfsapfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsapfs.so.1 \
python-abi"

inherit rpm
