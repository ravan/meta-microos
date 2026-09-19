SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "python314-libwrc-20260705-1.2.aarch64.rpm"
RPM_HASH = "b2b9cca3d7f9f85e1045dd1513d3749b4b6f02721ffdb444994794e29a2d13dd730cd7275646601046c0687f2313fd106c3c0693d36fa2aff841be703334f0cd"

RPROVIDES:${PN} += "python314-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
