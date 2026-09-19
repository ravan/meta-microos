SUMMARY = "Development Tools for applications which will use the Libjpeg Library"
DESCRIPTION = "The libjpeg-devel package includes the header files and libraries \
necessary for compiling and linking programs which will manipulate JPEG \
files using the libjpeg library."
LICENSE = "BSD-3-Clause"

PV = "62.4.0"

RPM_NAME = "libjpeg62-devel-62.4.0-85.1.aarch64.rpm"
RPM_HASH = "d08349662bfe20a73793b843823f1e5e3d3aedb838be2ea5e37d86bdea5be8e4ef3b5bbd1de211e2fe937c3d94ef7e0ff27b710848fadc31c66b6af3c341a544"

RPROVIDES:${PN} += "libjpeg-devel \
libjpeg62-devel \
pkgconfig-libjpeg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg62"

inherit rpm
