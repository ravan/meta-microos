SUMMARY = "Development files for the libfabric library"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the development files."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "libfabric-devel-2.6.0-1.3.aarch64.rpm"
RPM_HASH = "0f06819354116a4e2b6492bc441a76511912dc6d21b4228a80b28f3be7b311ef6107bc1dca69e93d7e4b1b7e21531ecb4204865811d9116ccd5ff5c0aa438922"

RPROVIDES:${PN} += "libfabric-devel \
pkgconfig-libfabric"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfabric1"

inherit rpm
