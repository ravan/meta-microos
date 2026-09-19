SUMMARY = "API documentation for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the API documentation for the HepMC library."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.1"

RPM_NAME = "HepMC-doc-3.3.1-1.8.noarch.rpm"
RPM_HASH = "7cb33a0a9bf9c28e7de9a196f4a15a27a43d51dd7d919d15aaf1955d3d72bb8f1d87e6198d920f1786394f6a71dca1c563f7cc7618d7a147cb34e56d34164a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HepMC-doc"

RDEPENDS:${PN} += ""

inherit rpm
