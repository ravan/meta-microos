SUMMARY = "Development files for libdom"
DESCRIPTION = "The libdom-devel package contains libraries and header files for \
developing applications that use libdom."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "libdom-devel-0.4.2-2.9.aarch64.rpm"
RPM_HASH = "520e00737e2ebddd7cc11660cc368cbd4b48bd2650670db928fe0963798d9453c11102b62c7b1fbf4ffcc339f5c1184a4e0b54e5ecf6209e01545ca12b600906"

RPROVIDES:${PN} += "libdom-devel \
pkgconfig-libdom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdom0 \
pkgconfig-libhubbub \
pkgconfig-libwapcaplet"

inherit rpm
