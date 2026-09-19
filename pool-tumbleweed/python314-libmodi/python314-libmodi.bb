SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python314-libmodi-20260902-1.1.aarch64.rpm"
RPM_HASH = "7cf20d5639c02bd5615256ed318587254de6f096a72afc1678c93c305e7fc33f79938c3a8c9483dab6ae5d84740d8ac987f9b476e20dca164573b65b4717fd64"

RPROVIDES:${PN} += "python314-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm
