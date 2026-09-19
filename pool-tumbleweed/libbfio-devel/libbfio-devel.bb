SUMMARY = "Development files for libbfio, a basic file input/output abstraction library"
DESCRIPTION = "libbfio is used in multiple other libraries like libewf, libmsiecf, \
libnk2, libolecf and libpff. It is used to chain I/O to support \
file-in-file access. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbfio."
LICENSE = "LGPL-3.0-or-later"

PV = "20260623"

RPM_NAME = "libbfio-devel-20260623-1.4.aarch64.rpm"
RPM_HASH = "2fc085336aa94dcb33e35ce257d799afd9546c3f470d997208c7f99379bcb64648969f5f408471b9dd5763aa9842f7b0fc017f43dd36078c6093a24570b316bd"

RPROVIDES:${PN} += "libbfio-devel \
pkgconfig-libbfio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio1"

inherit rpm
