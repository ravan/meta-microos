SUMMARY = "Development files for libredwg"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD. \
 \
This package contains the files required for development with libredwg."
LICENSE = "GPL-3.0-or-later"

PV = "0.14.8413"

RPM_NAME = "libredwg-devel-0.14.8413-1.2.aarch64.rpm"
RPM_HASH = "22a0b0b107a50d3f0e65c9506eacfd4860f59093919223e31b6911d84214c597da192a49f038e4d80f28866dde631361bb40a623c54bbe476a5df87203f34b70"

RPROVIDES:${PN} += "libredwg-devel \
pkgconfig-libredwg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libredwg0"

inherit rpm
