SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "LGPL-3.0-or-later & MPL-2.0"

PV = "3.3.1"

RPM_NAME = "python314-HepMC-3.3.1-1.8.aarch64.rpm"
RPM_HASH = "e02bafcfa14c8317612d50829ea654f995fc27f760235da46bd758ce90ede9d1aad7dfe01d7086b1d6bd5436958bd09adbb1f7d39f65ed3d9662225e5e44d187"

RPROVIDES:${PN} += "python3.14dist-pyhepmc3 \
python3.14dist-pyhepmc3.search \
python314-HepMC \
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
