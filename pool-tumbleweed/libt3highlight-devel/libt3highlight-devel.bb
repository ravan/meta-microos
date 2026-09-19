SUMMARY = "Development files for libt3highlight, a syntax highlighting library"
DESCRIPTION = "libt3highlight is a library that provides functions for syntax \
highlighting different types of text files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libt3highlight."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libt3highlight-devel-0.5.0-1.26.aarch64.rpm"
RPM_HASH = "6e8f10dc78a2da81b476ecb10755005b548e5429b3fc1c70859db62c67a6c756b1e4b90f628c36218681275b82b65d4862a623c487e87f6a8a8805c9bdbb5641"

RPROVIDES:${PN} += "libt3highlight-devel \
pkgconfig-libt3highlight"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libt3highlight2 \
pkgconfig-libpcre2-8 \
pkgconfig-libt3config"

inherit rpm
