SUMMARY = "Transport Independent RPC Library"
DESCRIPTION = "The Transport Independent RPC library (TI-RPC) is a replacement for the \
standard SunRPC library in glibc which does not support IPv6 addresses. \
This implementation allows the support of other transports than UDP and \
TCP over IPv4."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libtirpc3-1.3.7-1.5.aarch64.rpm"
RPM_HASH = "3c41fcb49221d7bed4aad31269d0e625558f1c37f030f216aca7f30d1e80c5454a6354973ae2a6ec580b7c3de6f3d23ec1afa795485c3421051a9bb198c3c94c"

RPROVIDES:${PN} += "libtirpc.so.3 \
libtirpc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libtirpc-netconfig"

inherit rpm
