SUMMARY = "Development files for libtracefs"
DESCRIPTION = "This library provides C APIs to access the kernel trace file system. \
 \
This subpackage contains the header files."
LICENSE = "LGPL-2.1-only"

PV = "1.8.3"

RPM_NAME = "libtracefs-devel-1.8.3-1.3.aarch64.rpm"
RPM_HASH = "a75c61736aa361e31750caab8ad63283e93cff3c6f628f10843915d5e5ca3d961baa5fa43e27acb443168a20ffe6a9821398de2818de5c8f978e95f1e474e667"

RPROVIDES:${PN} += "libtracefs-devel \
pkgconfig-libtracefs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtracefs1 \
pkgconfig-libtraceevent"

inherit rpm
