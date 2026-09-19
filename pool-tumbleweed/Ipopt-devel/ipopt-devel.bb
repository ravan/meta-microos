SUMMARY = "Development and header files for Ipopt"
DESCRIPTION = "This package contains the development and header files for Ipopt."
LICENSE = "EPL-2.0"

PV = "3.14.19"

RPM_NAME = "Ipopt-devel-3.14.19-1.7.aarch64.rpm"
RPM_HASH = "458f56d7fdf05358d0f2c644a3897402aa90b1a5ac1597b8187a08106b624bff01d11d06352788a956212dca0f32bd19ae66002f40820a101bac5156349dbbea"

RPROVIDES:${PN} += "Ipopt-devel \
ipopt-devel \
pkgconfig-ipopt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipopt3 \
mumps-devel \
pkgconfig-blas \
pkgconfig-lapack"

inherit rpm
