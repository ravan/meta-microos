SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python313-libsmraw-20260902-1.1.aarch64.rpm"
RPM_HASH = "0da212a7df00b70f87176475cd9a4318280a241d2e857d3d660da4048d573bd4a2d950877f3981115624573e038b603bf5f8166a3dc64a4779fcc93bb0ec48d9"

RPROVIDES:${PN} += "python3-libsmraw \
python313-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
