SUMMARY = "Deflate/zlib compatible compression library"
DESCRIPTION = "This package contain the libzopflipng PNG optimizer library."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "libzopflipng1-1.0.3-2.12.aarch64.rpm"
RPM_HASH = "cc1aa27054cb7c8fd0524b99d9b51301de8ad87868609e733b05aefae181498f0349b65727074798f9f0f3d5d6096015ed79e208514e0c7e34ad8956aef75432"

RPROVIDES:${PN} += "libzopflipng.so.1 \
libzopflipng1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzopfli.so.1"

inherit rpm
