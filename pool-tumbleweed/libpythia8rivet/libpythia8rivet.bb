SUMMARY = "Rivet bindings for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides the shared libraries for the rivet bindings of \
pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.316"

RPM_NAME = "libpythia8rivet-8.316-1.3.aarch64.rpm"
RPM_HASH = "ccaf5f874dbe542c0f55588a2f2aa4d146bded802a138b323f4af37030dcd4301930761a6d18694c1e5afb1818e1ef9ff4d9d6e78c80dff3c67be0fa791768bf"

RPROVIDES:${PN} += "libpythia8rivet \
libpythia8rivet.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.4 \
libRivet-4.1.2.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
