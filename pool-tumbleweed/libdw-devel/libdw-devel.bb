SUMMARY = "Development files for libdw"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libdw."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "libdw-devel-0.194-1.4.aarch64.rpm"
RPM_HASH = "d3efd56526f344c680888c3f14076aaa0baadea5f49faafc9f3ea39d9c7266484d03410b1fa4d009c2490a568d763ac9e120bfc3d6443c69bd980cc0d83675cd"

RPROVIDES:${PN} += "libdw-devel \
pkgconfig-libdw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libdw1 \
libelf-devel \
pkgconfig-libelf \
pkgconfig-liblzma \
pkgconfig-libzstd \
pkgconfig-zlib"

inherit rpm
