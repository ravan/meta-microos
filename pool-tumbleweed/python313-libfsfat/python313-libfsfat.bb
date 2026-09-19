SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260826"

RPM_NAME = "python313-libfsfat-20260826-1.1.aarch64.rpm"
RPM_HASH = "91d79b6d7d72b304e727fba4323ccceede3a08348a8c57dac341baa0eeec0a1426c94bd6c1e3780a5200be7d5839d8f9bce7ec3fb5d3a5cd850468df1b76bd6a"

RPROVIDES:${PN} += "python3-libfsfat \
python313-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
