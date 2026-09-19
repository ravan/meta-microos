SUMMARY = "Package provides recommended R-KernSmooth"
DESCRIPTION = "This packages provides R-KernSmooth, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.23.26"

RPM_NAME = "R-KernSmooth-2.23.26-58.3.aarch64.rpm"
RPM_HASH = "29ca0ba375c2174f575b5f65fd4c97da561147720d3919d8c5f498c0ee43ae32ac4564c5a48ac5f9ad8b24f3163d56a13f8c4515009778f38f1c8eee4e2dbd09"

RPROVIDES:${PN} += "R-KernSmooth"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libRblas.so \
libc.so.6 \
libm.so.6"

inherit rpm
