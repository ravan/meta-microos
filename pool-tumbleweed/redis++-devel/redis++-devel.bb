SUMMARY = "Header files and libraries for redis++"
DESCRIPTION = "The redis++-devel package contains the header files and \
libraries for redis-plus-plus."
LICENSE = "Apache-2.0"

PV = "1.3.15"

RPM_NAME = "redis++-devel-1.3.15-1.3.aarch64.rpm"
RPM_HASH = "92bcedb6dd388a90d7e7d292bd69de8018fc3795db2470a04f384fe8c9cff3c28cdf5ebbb9e8d71e73b616ec792d4e7d0103fb4bde720e890625aa1bf5502ff1"

RPROVIDES:${PN} += "cmake-redis++ \
pkgconfig-redis++ \
redis++-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libredis++1 \
pkgconfig-hiredis \
pkgconfig-hiredis-ssl"

inherit rpm
