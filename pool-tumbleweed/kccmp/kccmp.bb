SUMMARY = "Tool for kernel configurations comparison"
DESCRIPTION = "kccmp is a simple tool for comparing two linux kernel '.config' files."
LICENSE = "GPL-2.0-only"

PV = "1.0.0"

RPM_NAME = "kccmp-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "d9dab68d14934c4dfbe3e94b6d6f8aa4aa8ca174f6a0cdf5c9d023a35e6fbb45c67da5fbf0ef00c747775889d1a028b3612db57b6419ec396c21db32b1009c10"

RPROVIDES:${PN} += "kccmp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
