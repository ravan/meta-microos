SUMMARY = "LibJWT C Library"
DESCRIPTION = "LibJWT C Library - devel headers and tools"
LICENSE = "MPL-2.0"

PV = "1.18.3"

RPM_NAME = "libjwt-devel-1.18.3-2.3.aarch64.rpm"
RPM_HASH = "14d62a6ba5b24f8bad05ab42cd79ab17837144edf7e889f63dd66de412b49bba412f749ff6c7da34ba0655c42fefe72bfcdb96205cedd39b8c614c468477eb84"

RPROVIDES:${PN} += "cmake-libjwt \
libjwt-devel \
pkgconfig-libjwt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjwt.so.2 \
libjwt2"

inherit rpm
