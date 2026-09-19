SUMMARY = "Library for generating maximally-localized Wannier functions - shared library"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy. \
 \
This package provides the shared library for wannier90."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "libwannier90_4-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "f033e2f91d0f28402fdcc504c1384f2273c775326a9efc5ef5ea959cb43014be35f0156772deb009cc7780d08781ed4d28524a1eb4f3135fdaac044e221c53e4"

RPROVIDES:${PN} += "libwannier90-4 \
libwannier90.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6"

inherit rpm
