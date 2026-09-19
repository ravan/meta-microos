SUMMARY = "Header files for libzypp, a library for package management"
DESCRIPTION = "Development files for libzypp, a library for package, patch, pattern \
and product management."
LICENSE = "GPL-2.0-or-later"

PV = "17.38.15"

RPM_NAME = "libzypp-devel-17.38.15-1.1.aarch64.rpm"
RPM_HASH = "68773986ec147dd41fb7eb0cff6501dc1c89029ee05bbf93f71f26e64d600466f4ec5fd4acbf5167118836213069f723c91c4252a654cecaf0ad37d0910eef68"

RPROVIDES:${PN} += "cmake-Zypp \
libzypp-devel \
libzypp-tui-devel \
pkgconfig-libzypp \
yast2-packagemanager-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
bzip2 \
glibc-devel \
libboost-headers-devel \
libboost-program-options-devel \
libboost-test-devel \
libboost-thread-devel \
libcurl-devel \
libsolv-devel-static \
libstdc++-devel \
libudev-devel \
libxml2-devel \
libzypp \
pkgconfig-openssl \
popt-devel \
rpm-devel \
zlib-devel"

inherit rpm
