SUMMARY = "An NFS traffic monitoring tool"
DESCRIPTION = "Nfswatch is a command-line tool for monitoring NFS traffic. \
Nfswatch can capture and analyze the NFS packets on a particular \
network interface or on all interfaces."
LICENSE = "BSD-2-Clause"

PV = "4.99.14"

RPM_NAME = "nfswatch-4.99.14-1.6.aarch64.rpm"
RPM_HASH = "3cca12cfe1f11857a2b4515ee0cf72e9f9b9f719ddfcc4d55521689ea98871f8cd210b6d897ec46f83a50981b364f3217d555fd4858535fbf6f736430ce9102b"

RPROVIDES:${PN} += "nfswatch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libpcap.so.1 \
libtinfo.so.6 \
libtirpc.so.3"

inherit rpm
