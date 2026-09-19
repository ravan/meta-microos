SUMMARY = "Development Files for OpenColorIO"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.5.2"

RPM_NAME = "OpenColorIO-devel-2.5.2-1.3.aarch64.rpm"
RPM_HASH = "5942f22bfc09486e588b6bdfb8f39c328227e14ad2ad261edd5453db356db503581a7edb4a9d43c5bc86a4c60d62525cdbae03d60c8ab5778f9e2755742a3d63"

RPROVIDES:${PN} += "OpenColorIO-devel \
cmake-OpenColorIO \
pkgconfig-OpenColorIO"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOpenColorIO2-5"

inherit rpm
