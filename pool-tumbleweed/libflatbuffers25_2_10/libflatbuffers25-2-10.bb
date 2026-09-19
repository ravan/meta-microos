SUMMARY = "Memory Efficient Serialization Library"
DESCRIPTION = "FlatBuffers is a serialization library for games and other memory constrained programs. \
FlatBuffers allows to directly access serialized data without unpacking/parsing \
it first, while still having great forwards/backwards compatibility. \
 \
This package provides the libflatbuffers shared library."
LICENSE = "Apache-2.0"

PV = "25.2.10"

RPM_NAME = "libflatbuffers25_2_10-25.2.10-2.6.aarch64.rpm"
RPM_HASH = "79a43d5799e153957c9dcf28a79dcdd9189fb921d4d269ee4231100d6dbe61ed8261f977b1f0d4c702311e06b7c6c62b586132fe6c6e870bf7d68305a4a46de5"

RPROVIDES:${PN} += "libflatbuffers \
libflatbuffers.so.25.2.10 \
libflatbuffers25-2-10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
