SUMMARY = "User-space RDMA fabric interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "libfabric1-2.6.0-1.3.aarch64.rpm"
RPM_HASH = "b63e4e895c87a61b3e6d879c821ffc0be99e5785c48589d22738979e8585ac274186eac3bd84ad20c08a6d65604c7c56bc1b3d59d1d80cea960e754970d4c289"

RPROVIDES:${PN} += "libfabric.so.1 \
libfabric1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libefa.so.1 \
libibverbs.so.1 \
libnl-3.so.200 \
librdmacm.so.1 \
libucp.so.0 \
libucs.so.0"

inherit rpm
