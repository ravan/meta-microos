SUMMARY = "Shared Memory Communication via RDMA"
DESCRIPTION = "Shared Memory Communication via RDMA (SMC) is a socket over RDMA \
communication protocol that allows existing TCP socket applications to \
transparently benefit from RDMA when exchanging data via an RDMA over \
Converged Ethernet (RoCE) network. \
 \
The tools provided in this package allow existing TCP applications \
to use a RoCE network without needing to make changes in them."
LICENSE = "EPL-1.0"

PV = "1.8.8"

RPM_NAME = "smc-tools-1.8.8-1.1.aarch64.rpm"
RPM_HASH = "af09ddea49da5e027d8f15569b9760b7ddabb339a41c335908782f202fdf5ed2c17d9d99611ba9f9e945a55d11c53e298429ec0d2efa11b4ce2f5ed1c5e7071a"

RPROVIDES:${PN} += "libsmc-preload.so.1 \
smc-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
permissions"

inherit rpm
