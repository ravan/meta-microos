SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "LGPL-3.0-or-later & MPL-2.0"

PV = "3.3.1"

RPM_NAME = "python313-HepMC-3.3.1-1.8.aarch64.rpm"
RPM_HASH = "eedabfb31acb9b40626695fe413a7864f26aed677181df019928475a545d2b19614b4ba1312eeb3e4bc7c4233e993f62387d8f34a0662b0196e610ce996832fa"

RPROVIDES:${PN} += "python3-HepMC \
python3.13dist-pyhepmc3 \
python3.13dist-pyhepmc3.search \
python313-HepMC \
python3dist-pyhepmc3 \
python3dist-pyhepmc3.search"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHepMC3.so.4 \
libHepMC3search.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
