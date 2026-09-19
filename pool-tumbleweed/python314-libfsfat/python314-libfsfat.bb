SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260826"

RPM_NAME = "python314-libfsfat-20260826-1.1.aarch64.rpm"
RPM_HASH = "a583c8afdae622a4a32a5b387e39b953fd610bff0a54cdc016f6aa1295b5d0325d54ea07f6b42fa6f6fd4ba7ae9e9fb730037fdc5015cc6f87bbd47e1e41b08f"

RPROVIDES:${PN} += "python314-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
