SUMMARY = "FlexiBLAS NETLIB backend"
DESCRIPTION = "This package provides the NETLIB backend for FlexiBLAS."
LICENSE = "LGPL-3.0 & BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "flexiblas-netlib-3.5.0-1.2.aarch64.rpm"
RPM_HASH = "0c5c8904299eb98b9fd032a80e7078852563b3cd245f502aa2f316fec0a3b2d96f1dc3eecbfdbcab29575e72c881305eefcb7638fa3b501ac97aa01e49cdb0cc"

RPROVIDES:${PN} += "config-flexiblas-netlib \
flexiblas-netlib \
libflexiblas-netlib.so"

RDEPENDS:${PN} += "flexiblas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5"

inherit rpm
