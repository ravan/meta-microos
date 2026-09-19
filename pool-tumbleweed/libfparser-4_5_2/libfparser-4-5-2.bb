SUMMARY = "Library to evaluate strings as mathematical functions"
DESCRIPTION = "This C++ library offers a class which can be used to parse and \
evaluate a mathematical function from a string (which might be e.g. \
requested from the user). The syntax of the function string is \
similar to mathematical expressions written in C/C++ (the exact \
syntax is specified later in this document). The function can then be \
evaluated with different values of variables."
LICENSE = "LGPL-3.0"

PV = "4.5.2"

RPM_NAME = "libfparser-4_5_2-4.5.2-1.42.aarch64.rpm"
RPM_HASH = "990a1ebaf15fd9759f43a7a04f34ecc1aa6d3e3613793c45b17030b858525320b2e6b47885b78b392465801c4254dc38ab9504c21e637ca92f3a714268cc7ea6"

RPROVIDES:${PN} += "libfparser-4-5-2 \
libfparser-4.5.2.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
