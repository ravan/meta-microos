SUMMARY = "Development files for CSXCAD"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties. \
 \
This package contains libraries and header files for developing \
applications that use CSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "CSXCAD-devel-0.6.3-5.1.aarch64.rpm"
RPM_HASH = "f316788d3a36cfae786efc7302da6b017fdb34309c0d6cc1353d76a6178c0abe0e949a279bf8659025fe7c50d7e60ead56a92fbf11c22a309dc9614ad27ea423"

RPROVIDES:${PN} += "CSXCAD-devel"

RDEPENDS:${PN} += "libCSXCAD0"

inherit rpm
