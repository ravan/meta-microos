SUMMARY = "CoreSight Trace Decode library"
DESCRIPTION = "OpenCSD is an Arm CoreSight Trace Decode library."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "OpenCSD-1.8.3-1.2.aarch64.rpm"
RPM_HASH = "f23c48ef9326fb3cdbf1bc235e46c80ca14e3c0a7e260744272a25bd5cf0326d92bc739aa8808df2d72e644ef881b8860b6a276037654c0da5b65b46fe087a1d"

RPROVIDES:${PN} += "OpenCSD"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopencsd.so.1 \
libstdc++.so.6"

inherit rpm
