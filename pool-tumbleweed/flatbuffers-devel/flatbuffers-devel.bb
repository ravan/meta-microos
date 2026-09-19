SUMMARY = "Development files for flatbuffers"
DESCRIPTION = "FlatBuffers is a serialization library for games and other memory constrained programs. \
FlatBuffers allows to directly access serialized data without unpacking/parsing \
it first, while still having great forwards/backwards compatibility. \
 \
This package provides the libflatbuffers headers, development libraries, \
and tools."
LICENSE = "Apache-2.0"

PV = "25.2.10"

RPM_NAME = "flatbuffers-devel-25.2.10-2.6.aarch64.rpm"
RPM_HASH = "fc0c3faaaa0814425cd45980c381ae117116427535caebe06788271e8ec691db51b3715b0d14710725c3be19b30b00f2eb0124c979ed537c89cbdfd3c7fe4313"

RPROVIDES:${PN} += "cmake-flatbuffers \
flatbuffers-devel \
flatbuffers-devel-static \
pkgconfig-flatbuffers"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflatbuffers25-2-10 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
