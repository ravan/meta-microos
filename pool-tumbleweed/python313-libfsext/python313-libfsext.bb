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

RPM_NAME = "python313-libfsext-20260821-1.1.aarch64.rpm"
RPM_HASH = "de4cdc9258feeac46363cd388e359dd4628df559480a3e47a484d3f87723a97395a6c9500dde178623ffd879360cedb8fb98101d8c3040b15363a4e6b5408c8a"

RPROVIDES:${PN} += "python3-libfsext \
python313-libfsext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsext.so.1 \
python-abi"

inherit rpm
