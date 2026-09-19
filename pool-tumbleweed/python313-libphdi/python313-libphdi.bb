SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python313-libphdi-20260902-1.1.aarch64.rpm"
RPM_HASH = "c5264fa499547f5ad07352e5821cb2c0159b09475236339ae89340acf64cf30793dd5f345b000e9d34896fd520bea92cc0dd6e294512103372027951a95bddd6"

RPROVIDES:${PN} += "python3-libphdi \
python313-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
