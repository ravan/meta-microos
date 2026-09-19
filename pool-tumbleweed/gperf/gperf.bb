SUMMARY = "A Compiler Tool for Generating Perfect Hash Functions"
DESCRIPTION = "A perfect hash function is simply: a hash function and a data structure \
that allows recognition of a key word in a set of words using exactly \
one probe into the data structure."
LICENSE = "GPL-3.0-or-later"

PV = "3.3"

RPM_NAME = "gperf-3.3-1.6.aarch64.rpm"
RPM_HASH = "f62c6c21f58d234e7a80d587dc29e7e2e1b63eccd1c3ef5b7d026fa8c3426e370b541199a32ac7a320410aaa80891ae3fd32a21df597d79bfa6d0ff1995d2d1e"

RPROVIDES:${PN} += "gperf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
