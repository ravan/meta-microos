SUMMARY = "User-space RDMA Fabric Interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package only contains the fi_info binary."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "libfabric-2.6.0-1.3.aarch64.rpm"
RPM_HASH = "e324637672b69db0eeeb23235a59a5a266e40011103f6c706b2ca52f5a77c444bb3d53b67135469fc22139e76fe04a7adb99fd0c001d27aef739d77b6fcdbbc4"

RPROVIDES:${PN} += "libfabric"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1"

inherit rpm
