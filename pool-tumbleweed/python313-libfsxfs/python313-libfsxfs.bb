SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "python313-libfsxfs-20260901-1.1.aarch64.rpm"
RPM_HASH = "d02154a497a28ca0519cb6e2d2dfaa5e54d81e1f36ae711fd02a55ee47aee31c1c3f04f98ae59c99b35a924f3ea4fddcc9023a674f131d5b7c325758350f7da5"

RPROVIDES:${PN} += "python3-libfsxfs \
python313-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
