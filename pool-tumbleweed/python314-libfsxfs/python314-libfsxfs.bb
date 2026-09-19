SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "python314-libfsxfs-20260901-1.1.aarch64.rpm"
RPM_HASH = "2c2565d96bb678e8e9aa008a6d80c8b4c0322e0280c2287b907c879adfe097aa9dff1367e128bd8af34d2a74849ed7ada44c64714023b1c811f69e59894048a8"

RPROVIDES:${PN} += "python314-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
