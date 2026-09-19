SUMMARY = "Development files for tinyobjloader"
DESCRIPTION = "A single-file Wavefront .obj file loader written in C++. \
No dependency except for C++ STL. It can parse over 10M polygons with \
moderate memory and time. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of tinyobjloader."
LICENSE = "MIT"

PV = "2.0.0rc9"

RPM_NAME = "tinyobjloader-devel-2.0.0rc9-3.5.aarch64.rpm"
RPM_HASH = "21e68c150173e80039396a97730f4e36328cd93db841cc667204254b96701af848b6ab9acc16ed32f4514bf7501785db62c091695fa49f6d4f3c0a5f220dfb89"

RPROVIDES:${PN} += "pkgconfig-tinyobjloader \
tinyobjloader-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtinyobjloader2"

inherit rpm
