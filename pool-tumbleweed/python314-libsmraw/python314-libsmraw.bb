SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python314-libsmraw-20260902-1.1.aarch64.rpm"
RPM_HASH = "7e2d2d577ad2154372319d387ca1e295b2183956eae794efe7ced190d93edc7cc5f92c443cfa495870031da868767ef85366b941aa54a7e235c889ded8a0a4e6"

RPROVIDES:${PN} += "python314-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
