SUMMARY = "Header files for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the source and header files required for \
developing with HepMC."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.3.1"

RPM_NAME = "HepMC-devel-3.3.1-1.8.aarch64.rpm"
RPM_HASH = "1a06b3990a54599e0d5eb74b3589b622744600b77602aa65bf36c4be516f01ead1f5b4d8b05bf3b265cfcd1132c48412d81e6daafef5d6d3dc3a18f4aff1c949"

RPROVIDES:${PN} += "HepMC-devel \
HepMC3-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libHepMC3-4 \
libHepMC3search5"

inherit rpm
