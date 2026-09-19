SUMMARY = "Tools for reading RAW files obtained from digital photo cameras"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.22.2"

RPM_NAME = "libraw-tools-0.22.2-1.1.aarch64.rpm"
RPM_HASH = "ceed1a726e214a60dc230382622c0b829c9c7c9e1d1b3c3cde4baf60f16eeb0719715f52ead3b18629ff2b054bccc4d7c5541e6e8e4a09c3d4b8154e96c177ea"

RPROVIDES:${PN} += "libraw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libjpeg.so.8 \
libm.so.6 \
libraw-r.so.25 \
libraw.so.25 \
libstdc++.so.6"

inherit rpm
