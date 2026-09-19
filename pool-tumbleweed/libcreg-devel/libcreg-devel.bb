SUMMARY = "Development files for libcreg, a Windows 9x/Me REGF-type Registry file parser"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcreg."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260523"

RPM_NAME = "libcreg-devel-20260523-1.10.aarch64.rpm"
RPM_HASH = "f23b779eadf132626da0bdc22a4a536684f584c7507101488864c2b258892ab128abb34434d109eef824b4dc779687d4e523382de7c28fa06110d9da2b1b6acc"

RPROVIDES:${PN} += "libcreg-devel \
pkgconfig-libcreg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libcreg1"

inherit rpm
