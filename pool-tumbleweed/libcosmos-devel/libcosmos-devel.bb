SUMMARY = "A library providing a modern C++ API for the Linux operating system"
DESCRIPTION = "A library providing a modern C++ API for the Linux operating system. \
 \
Header and development files for libcosmos."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "libcosmos-devel-0.4.5-1.4.aarch64.rpm"
RPM_HASH = "4c799f11fc1c3ffade640c8cb5a62fe7a7eb74218438d3fc3834e4ac0604a048fb920046f33974f96aa33b46a9bd8207932485620287403281a1f5d206519b98"

RPROVIDES:${PN} += "libcosmos-devel \
pkgconfig-libcosmos"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcosmos-4 \
libstdc++-devel"

inherit rpm
