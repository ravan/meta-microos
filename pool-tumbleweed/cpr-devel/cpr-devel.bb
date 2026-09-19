SUMMARY = "The development files for libcpr"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use libcpr."
LICENSE = "MIT"

PV = "1.14.2"

RPM_NAME = "cpr-devel-1.14.2-1.2.aarch64.rpm"
RPM_HASH = "36d598386339c23ea4327fcf31d314cd3bfc1dbf11a3d93583e69eeed6375581b22aaf07e580f8158c057c81b7cb94a461a22386c9b9f337489165a75560ed78"

RPROVIDES:${PN} += "cmake-cpr \
cpr-devel"

RDEPENDS:${PN} += "libcpr1 \
libunistring-devel \
pkgconfig-libcurl \
pkgconfig-libssl \
pkgconfig-zlib"

inherit rpm
