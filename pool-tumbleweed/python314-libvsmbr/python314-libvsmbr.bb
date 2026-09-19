SUMMARY = "Library and tools to access the MS-DOS volume system format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20240505"

RPM_NAME = "python314-libvsmbr-20240505-1.20.aarch64.rpm"
RPM_HASH = "02f71caad11017cde2eb8e85d3b68ef195ce38de8fff300c3328943ad3799c55d28e0904a553f13413f25606ceabf06def67fb3c7f6871c27b4d76da71892927"

RPROVIDES:${PN} += "python314-libvsmbr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsmbr.so.1 \
python-abi"

inherit rpm
