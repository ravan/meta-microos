SUMMARY = "A modern Dune II reimplementation"
DESCRIPTION = "Lead one of three interplanetary houses, Atreides, Harkonnen or Ordos, \
in an attempt to harvest the largest amount of spice from the sand \
dunes. Exchange your spice stockpiles for credits through refinement \
and build an army capable of thwarting attempts of the other houses to \
stop your harvesting! \
 \
Dune Legacy is an effort by a handful of developers to revitalize the \
first-ever real-time strategy game. The original game was the basis \
for the hugely successful Command and Conquer series, and the gameplay \
has been replicated an extended to a wide variety of storylines and \
series. \
 \
NOTE: Original Dune 2 game files are needed."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.5"

RPM_NAME = "dunelegacy-0.99.5-2.1.aarch64.rpm"
RPM_HASH = "0b795e1a4e3f882e42a8e27f7a520bcd67de9b09a00e2288e70b692c6bd2bb6f642da3ba49bc5d9af7866595c950e7a1d9703b6795c7085f9e9130b33e9c499e"

RPROVIDES:${PN} += "dunelegacy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libdiscord-rpc.so.3.4.0 \
libgcc-s.so.1 \
libm.so.6 \
libminiupnpc.so.21 \
libstdc++.so.6"

inherit rpm
