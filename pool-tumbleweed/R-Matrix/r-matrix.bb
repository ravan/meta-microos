SUMMARY = "Package provides recommended R-Matrix"
DESCRIPTION = "This packages provides R-Matrix, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.7.5"

RPM_NAME = "R-Matrix-1.7.5-58.3.aarch64.rpm"
RPM_HASH = "9e80038e64518da28da52a97aeb160d7c9fd26e21c73296b662f94c683e3ac4b73f6e526edfdb91324e7525474e0382bd178996466714bef2a0bbed8cea182fb"

RPROVIDES:${PN} += "R-Matrix \
R-Matrix-devel"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libRblas.so \
libRlapack.so \
libc.so.6 \
libm.so.6"

inherit rpm
