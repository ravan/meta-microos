SUMMARY = "Development files for arpack-ng"
DESCRIPTION = "The arpack-ng-devel package contains libraries and header files for \
developing applications that use arpack-ng."
LICENSE = "BSD-3-Clause"

PV = "3.9.1"

RPM_NAME = "arpack-ng-devel-3.9.1-4.6.aarch64.rpm"
RPM_HASH = "c2d139549ab0683453a62f855e4e782b54b8287b00143c7e785bf74dc3b7a8a3c146beef638ca6cfa6186c22f4ac1b5dd398106acc16a3fe512c2440066ca738"

RPROVIDES:${PN} += "arpack-devel \
arpack-ng-devel \
cmake-arpackng \
pkgconfig-arpack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
blas-devel \
gcc-fortran \
lapack-devel \
libarpack2"

inherit rpm
