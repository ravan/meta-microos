SUMMARY = "HepMC bindings for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides the shared libraries for the HepMC bindings of \
pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.316"

RPM_NAME = "libpythia8hepmc3-8.316-1.3.aarch64.rpm"
RPM_HASH = "989bfae4d5d5273f27077a2746d55726d74bde2d98e6598cb8653bb5cd7462e16631adc006daa1c6e774abc87fc98f14943107ab9f94c9640dc5f8fe2abbe933"

RPROVIDES:${PN} += "libpythia8hepmc3 \
libpythia8hepmc3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
