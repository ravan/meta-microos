SUMMARY = "Development package for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides the header and source files for development with \
pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.316"

RPM_NAME = "pythia-devel-8.316-1.3.aarch64.rpm"
RPM_HASH = "05c2283c54e454dda5a4c3d6871a78ad425330de57c48af14d88d3d3440a2b4308ea26f1a87a1a7c6d7c1f34ecb307f2bc3a7d6765029f05a6348a7ba70ca3ec"

RPROVIDES:${PN} += "config-pythia-devel \
pythia-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libpythia8 \
libpythia8hepmc3 \
libpythia8lhapdf6 \
libpythia8rivet"

inherit rpm
