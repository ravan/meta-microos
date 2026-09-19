SUMMARY = "Development files for the gcab cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides development files to build code against \
libgcab."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "gcab-devel-1.6-2.1.aarch64.rpm"
RPM_HASH = "9684b1489224750d7d6f97a1368db6ffa7677d591ed271037db7b399d3a8e14a7f4dab48a03cfdedc10a94cabe28f94bad72ae8d6f6f39ba84a6ea376888fceb"

RPROVIDES:${PN} += "gcab-devel \
pkgconfig-libgcab-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcab-1-0-0 \
pkgconfig-gio-2.0"

inherit rpm
