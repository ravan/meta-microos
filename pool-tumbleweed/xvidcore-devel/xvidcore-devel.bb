SUMMARY = "Development files for the Xvid video codec"
DESCRIPTION = "This package contains header files, static library and API \
documentation for the Xvid video codec."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7"

RPM_NAME = "xvidcore-devel-1.3.7-4.6.aarch64.rpm"
RPM_HASH = "2acabec6b27e236899349cf42b9cf8d4ba3d5b32eb8c36537149705bbd14cd59302b2267a70f3fa1d72fa93bb2597921f0db1e5ce8e41b84570ec9546cfe1626"

RPROVIDES:${PN} += "libxvidcore-devel \
xvidcore-devel"

RDEPENDS:${PN} += "libxvidcore4"

inherit rpm
