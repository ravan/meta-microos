SUMMARY = "Realtime plotting utility for terminals"
DESCRIPTION = "A realtime plotting utility for terminals. It takes data from stdin, and \
plots on a terminal or console. \
It supports rate calculation for counters, and up to two plots on a single \
display using reverse video for the second line."
LICENSE = "Apache-2.0"

PV = "1.7.6"

RPM_NAME = "ttyplot-1.7.6-1.2.aarch64.rpm"
RPM_HASH = "35ee583411ca659814336547e1f94fc15894c62e63aa58f1bdd1c10ca626fdc30823b8eb09d3ff0e6f164a317b013ad481ef7b35c9a1d3ca94ade5f27a220272"

RPROVIDES:${PN} += "ttyplot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaa.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
