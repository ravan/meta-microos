SUMMARY = "Library and tools to access the Extended File System"
DESCRIPTION = "libfsext is a library to access the Extended File System (ext). \
 \
Read-only supported ext formats: \
 \
* ext2 (version 2) \
* ext3 (version 3) \
* ext4 (version 4) \
 \
Supported ext format features: \
 \
* ext4 inline data \
 \
Unsupported ext format features: \
 \
* ext (version 1) \
* compression \
* encryption"
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260821"

RPM_NAME = "python314-libfsext-20260821-1.1.aarch64.rpm"
RPM_HASH = "a9d7b3b52c0443e8808de15884658499a58e30fb9c95d7fbf3e2d896ca653e517a891c9961add80c9b7de893e6f4ef06a2a5fc02155182b2953de426c21fc5b6"

RPROVIDES:${PN} += "python314-libfsext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsext.so.1 \
python-abi"

inherit rpm
