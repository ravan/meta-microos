SUMMARY = "A High-Level Audio Library"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library. This package contains demo binaries."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "audaspace-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "d199e2d61cadd9cd8a974a771e439e283a05209908786b1fcb058064d2ba4f6bf3a5b631e79e370d95a5cab431b6ca94028920bf175b39725875db7dde796a27"

RPROVIDES:${PN} += "audaspace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.10 \
libaudopenal.so \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
