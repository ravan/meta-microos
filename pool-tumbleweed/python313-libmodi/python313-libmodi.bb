SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python313-libmodi-20260902-1.1.aarch64.rpm"
RPM_HASH = "d82648d18ff239ed23b31ad6d401cdfed6c31ff9865cfc5393912d47fca038179e1f052397b84390db0a6f5cffad2534c43c874897b5307d06eae1a9d287dee0"

RPROVIDES:${PN} += "python3-libmodi \
python313-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm
