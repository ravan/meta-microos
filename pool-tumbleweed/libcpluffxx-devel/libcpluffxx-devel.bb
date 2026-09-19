SUMMARY = "Development files for libcpluffxx"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use libcpluffxx."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "libcpluffxx-devel-0.2.1-1.5.aarch64.rpm"
RPM_HASH = "d250e9697c156da227509629f924637499a241849a42fcc0cc1fb3ba1956b66d996fea9d42464cf47639e9af81c63de3170d3386de8fff04fe158e0732da9968"

RPROVIDES:${PN} += "libcpluffxx-devel \
pkgconfig-libcpluffxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpluffxx0 \
pkgconfig-libcpluff"

inherit rpm
