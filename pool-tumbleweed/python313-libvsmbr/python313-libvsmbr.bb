SUMMARY = "Library and tools to access the MS-DOS volume system format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20240505"

RPM_NAME = "python313-libvsmbr-20240505-1.20.aarch64.rpm"
RPM_HASH = "27992c9d4d94b7aafadc1adff77c275bc15dc77cccc5f27d291643cdf10f9837aa401ce41d46983f888e3a7f01b9c8a39d8e022cd1c95a986c845fc9a1e38f4a"

RPROVIDES:${PN} += "python3-libvsmbr \
python313-libvsmbr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsmbr.so.1 \
python-abi"

inherit rpm
