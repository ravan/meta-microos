SUMMARY = "Development files for the Transport Independent RPC Library"
DESCRIPTION = "The Transport Independent RPC library (TI-RPC) is a replacement for the \
standard SunRPC library in glibc which does not support IPv6 addresses. \
This implementation allows the support of other transports than UDP and \
TCP over IPv4."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libtirpc-devel-1.3.7-1.5.aarch64.rpm"
RPM_HASH = "731aa2e2253ce1f9cbad3b0c63c09a537dd192e23428d05699f92f85ac3b838e76e84891f46662a9cae7ec4a99b67958a0e2c23e65ce5155572c15f9426f8903"

RPROVIDES:${PN} += "libtirpc-devel \
pkgconfig-libtirpc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libtirpc3"

inherit rpm
