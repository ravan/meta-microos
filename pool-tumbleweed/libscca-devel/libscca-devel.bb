SUMMARY = "Development files for libscca"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libscca."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260527"

RPM_NAME = "libscca-devel-20260527-1.11.aarch64.rpm"
RPM_HASH = "074f1cfc67a69e27307d1da12c6c53468e28c5de8ae5d677b433fa9b0adbca5660ee071f46495e82c6eb477fdcc062436c9e67dcc747ffd7926c69acd182d080"

RPROVIDES:${PN} += "libscca-devel \
pkgconfig-libscca"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libscca1"

inherit rpm
