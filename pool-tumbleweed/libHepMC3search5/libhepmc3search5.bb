SUMMARY = "Shared library for HepMC search"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the shared library for HepMC3 searches."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.3.1"

RPM_NAME = "libHepMC3search5-3.3.1-1.8.aarch64.rpm"
RPM_HASH = "7ff676074cb128c4146123714e538f83ec64f5d7fecfe17a28b1a76fee677e7b7907268dae9589b763ba1f790147f0ffacdd2ee84d5ee1c72730641b4b15c906"

RPROVIDES:${PN} += "libHepMC3search.so.5 \
libHepMC3search5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
