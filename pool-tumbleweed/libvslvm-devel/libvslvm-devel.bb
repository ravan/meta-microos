SUMMARY = "Header files and libraries for developing applications for libvslvm"
DESCRIPTION = "Header files and libraries for developing applications for libvslvm \
 \
See libvslvm for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libvslvm."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "libvslvm-devel-20260901-1.1.aarch64.rpm"
RPM_HASH = "9f677548b37c6c53c4490405188ecb81a11651debe3762440a5b09402ce1acaf13054bc85fe4a1ac3a0f889702ecc4ed20b9daf7f2a90a7dcbb61384ad372bda"

RPROVIDES:${PN} += "libvslvm-devel \
pkgconfig-libvslvm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvslvm1"

inherit rpm
