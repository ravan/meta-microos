SUMMARY = "Header files for the sympol library"
DESCRIPTION = "SymPol is a C++ tool to work with symmetric polyhedra. \
This package contains the header files for using the sympol library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.9"

RPM_NAME = "sympol-devel-0.1.9-3.9.aarch64.rpm"
RPM_HASH = "91c5f1025625a66fc531842fa0f5cabd1cdf5ec9f503b81419a0d3304a07de9823872741b268fa545fd318315d78acb7391c1b91c0c2bc33efb2d6c50375fe1d"

RPROVIDES:${PN} += "sympol-devel"

RDEPENDS:${PN} += "libsympol0-1 \
permlib-devel"

inherit rpm
