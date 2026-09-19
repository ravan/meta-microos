SUMMARY = "Development files for libvsmbr"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume systems. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsmbr."
LICENSE = "LGPL-3.0-or-later"

PV = "20240505"

RPM_NAME = "libvsmbr-devel-20240505-1.20.aarch64.rpm"
RPM_HASH = "d1673f3f382b221624ac36731eef1aef9665cada8f8c00494266bbe2236853c14b2e52f1ed1ef1930d3548f8d8f2ec5d445d663aa19d8dfe8c08b74bb3ade1b0"

RPROVIDES:${PN} += "libvsmbr-devel \
pkgconfig-libvsmbr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvsmbr1"

inherit rpm
