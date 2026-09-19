SUMMARY = "LHAPDF bindings for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides the shared libraries for the lhapdf6 bindings of \
pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.316"

RPM_NAME = "libpythia8lhapdf6-8.316-1.3.aarch64.rpm"
RPM_HASH = "d032f2afa20f56046e7aa9cc7f793a10b0ced5a81c22348f5acfccd4fb11b35bc42f91fada2292059bb881a3a14b5df4aba73d97806386649e5e56deb7afdb6d"

RPROVIDES:${PN} += "libpythia8lhapdf6 \
libpythia8lhapdf6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLHAPDF-6.5.5.so \
libc.so.6 \
libgcc-s.so.1 \
libpythia8.so \
libstdc++.so.6"

inherit rpm
