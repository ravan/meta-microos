SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python314-libphdi-20260902-1.1.aarch64.rpm"
RPM_HASH = "3647895d9f0afeff67815cd0df4cf2715b4451541e8ab6ad187e50eea9a210b9246044419b5a62deb341a833bca01db6a5dc9e11424a1fa5b54d8ecaf3c51036"

RPROVIDES:${PN} += "python314-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
