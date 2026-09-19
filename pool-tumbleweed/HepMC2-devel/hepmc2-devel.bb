SUMMARY = "Header files for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the source and header files required for \
developng with HepMC."
LICENSE = "GPL-2.0-only"

PV = "2.06.11"

RPM_NAME = "HepMC2-devel-2.06.11-3.5.aarch64.rpm"
RPM_HASH = "c154b38aa2bbc414c2d2258b662eda97db1a77da0567a496ed1e980e409f2ae51f680d4732dc644423c88540413776ca5f4d992cb1f36099a368e3ce3e569b39"

RPROVIDES:${PN} += "HepMC2-devel"

RDEPENDS:${PN} += "libHepMC4"

inherit rpm
