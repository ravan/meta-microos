SUMMARY = "Development files for dpkg"
DESCRIPTION = "Libraries and header files for dpkg."
LICENSE = "GPL-2.0-or-later"

PV = "1.22.22"

RPM_NAME = "dpkg-devel-1.22.22-1.4.aarch64.rpm"
RPM_HASH = "cc904b9b79e9b73335a8a45950fe477f9df8b811fac7183d31179adbd05e680e6edc254985f950a9f9593e9ac8f4fd4a3d6cf1f74b3074883e713314a7364ee5"

RPROVIDES:${PN} += "deb-devel \
dpkg-devel \
pkgconfig-libdpkg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dpkg \
libmd-devel"

inherit rpm
