SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "wannier90-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "2214e69f647c02a6c239b5765022ca83b3be0c869fb200e2048ed466d15f1f91a1510141795df2f11be90f888127aa95761a93d6454ec5a4b506d78d0d6a1e92"

RPROVIDES:${PN} += "wannier90"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libwannier90.so.4"

inherit rpm
