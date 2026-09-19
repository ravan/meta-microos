SUMMARY = "Development files for libregf, a Windows REGF-type Registry file parser"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libregf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libregf-devel-20260526-1.10.aarch64.rpm"
RPM_HASH = "37c93dc36c1edae050a4ef8fde66ba193fbdbd1dc2bd018af56a3491081fd2a07f2ebd10663e28789900c6c850f1b6899e844cd265a9aa124912f470085010c2"

RPROVIDES:${PN} += "libregf-devel \
pkgconfig-libregf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libregf1"

inherit rpm
