SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "python313-libwrc-20260705-1.2.aarch64.rpm"
RPM_HASH = "d5a1feb7015e4e614f717b6328c7c4faec5340ef18b34cd2ea62c265e6a11c3dba0d3f99a5f0efc3a52ca4fd3338640a65b5b039104794b7d28aaccca5b02618"

RPROVIDES:${PN} += "python3-libwrc \
python313-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
