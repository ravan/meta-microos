SUMMARY = "Development files for ngtcp2"
DESCRIPTION = "Development files for use with libngtcp2, which implements the \
QUIC protocol."
LICENSE = "MIT"

PV = "1.25.0"

RPM_NAME = "ngtcp2-devel-1.25.0-2.1.aarch64.rpm"
RPM_HASH = "ba120f8ffd85b950c11cc737ae3203feb0fc414e4f556303e1ab8c22206d0ab3d5706a9fe6a22bb929efc7ae492b74104d0ed1c40157d82b5b45bb7276a31c8c"

RPROVIDES:${PN} += "libngtcp2-devel \
ngtcp2-devel \
pkgconfig-libngtcp2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libngtcp2-16"

inherit rpm
