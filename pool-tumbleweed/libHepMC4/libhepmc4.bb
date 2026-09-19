SUMMARY = "Shared libraries for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported: the number of entries \
is unlimited, spin density matrices can be stored with each vertex, \
flow patterns (such as color) can be stored and traced, integers \
representing random number generator states can be stored, and an \
arbitrary number of event weights can be included. Particles and \
vertices are kept separate in a graph structure, physically similar to \
a physics event. The added information supports the modularisation of \
event generators. Event information is accessed by means of iterators \
supplied with the package. \
 \
This package provides the shared libraries for HepMC."
LICENSE = "GPL-2.0-only"

PV = "2.06.11"

RPM_NAME = "libHepMC4-2.06.11-3.5.aarch64.rpm"
RPM_HASH = "5493014fd8cb70b66834ced456269d6a6e71c9aa79d62a969eb64f40694e6e7e8c249dd5df988efb66cc7212b0f7f94d5355c7a69407ad8f1aa7abd653523ca5"

RPROVIDES:${PN} += "libHepMC.so.4 \
libHepMC4 \
libHepMCfio.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
