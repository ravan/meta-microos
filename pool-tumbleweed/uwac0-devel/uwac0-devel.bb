SUMMARY = "Remote Desktop Toolkit libuwac development files"
DESCRIPTION = "This package contains header files for developing applications that \
use the uwac library."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "uwac0-devel-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "804b1685a80d8d1168f87147d0e2c6710e770921ad5dbd6e239abea62673fa6a4cefa842cef6ad2c014a506f8a8ec85fa7c00b2bab821ca011b9d95d4aff3d5d"

RPROVIDES:${PN} += "cmake-uwac \
libuwac0-devel \
pkgconfig-uwac0 \
uwac0-0-devel \
uwac0-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libuwac0-0"

inherit rpm
