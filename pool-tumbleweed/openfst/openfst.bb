SUMMARY = "Weighted finite-state transducer library"
DESCRIPTION = "OpenFst is a library for constructing, combining, optimizing and \
searching weighted finite-state transducers (FSTs)."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "openfst-1.8.4-1.7.aarch64.rpm"
RPM_HASH = "e2c8191d4d1d24e8ba93d58cbc8c18f33b6b1766ccf0b3c9b80573ce17527ce6fc0f73f00bdb230d0b08ca64cb3104ba57e67e3f2a7f6d3ab7d2188d55dd699d"

RPROVIDES:${PN} += "openfst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfst.so.26 \
libfstscript.so.26 \
libstdc++.so.6"

inherit rpm
