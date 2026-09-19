SUMMARY = "Development files for libzdb"
DESCRIPTION = "The libraries and header files for developing applications that use libzdb"
LICENSE = "GPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "libzdb-devel-3.4.1-1.5.aarch64.rpm"
RPM_HASH = "62d40c357f4df549e20fc42e8c6579fff8eb177f7042b5eb963511a09425242e7f26bad63174e0caab2d563cb277daf817393b6281dc54887eb7f409138ad314"

RPROVIDES:${PN} += "libzdb-devel \
pkgconfig-zdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzdb17"

inherit rpm
