SUMMARY = "Package provides recommended R-class"
DESCRIPTION = "This packages provides R-class, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.23"

RPM_NAME = "R-class-7.3.23-58.3.aarch64.rpm"
RPM_HASH = "0fe480879831502bd210ec04cfdcc47356fa4b03f03402013df0f1ee76ea49cfca7c98ddeee6b50ea3940d50c44aa95d815c53474024b2bcb2a22559eb7810e9"

RPROVIDES:${PN} += "R-class"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
