SUMMARY = "Devel files for c++utilities"
DESCRIPTION = "Development files for c++utilities"
LICENSE = "GPL-2.0-or-later"

PV = "5.34.2"

RPM_NAME = "c++utilities-devel-5.34.2-1.2.aarch64.rpm"
RPM_HASH = "35e48298bdba47e8361b89806a7c4e0c213375e2bd2d6e6daa97aa4c22215bfd370a96faef80d0ae9ce9c451c60a2f6da701b1058ec69a052a16afb98b779529"

RPROVIDES:${PN} += "c++utilities-devel \
pkgconfig-c++utilities"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
doxygen \
glibc-devel \
libc++utilities5 \
libstdc++-devel \
pkg-config"

inherit rpm
