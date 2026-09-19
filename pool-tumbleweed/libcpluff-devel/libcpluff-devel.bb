SUMMARY = "Development files for libcpluff"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use libcpluff."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "libcpluff-devel-0.2.1-1.5.aarch64.rpm"
RPM_HASH = "2ae6e15a1a19a30f5afc90fdb60ceeef6d3c9459fef4a946e6edb88ef6db5f4e3e09351de3d0f5c5d49f76770da084867ec0905647520df20f5c9fa1598a7728"

RPROVIDES:${PN} += "libcpluff-devel \
pkgconfig-libcpluff"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpluff0"

inherit rpm
