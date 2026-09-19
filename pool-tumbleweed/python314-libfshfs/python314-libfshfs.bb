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
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260826"

RPM_NAME = "python314-libfshfs-20260826-1.1.aarch64.rpm"
RPM_HASH = "d3d7ef878ce24074c4601c9058318adf5938f5574818c7905f43dfc9c828b158df97a938595ec2406ab0de5e5b0e8315c22d3a5d1222272368928bd52d196d5e"

RPROVIDES:${PN} += "python314-libfshfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfshfs.so.1 \
python-abi"

inherit rpm
