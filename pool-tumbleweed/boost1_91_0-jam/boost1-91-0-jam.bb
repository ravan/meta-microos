SUMMARY = "A Boost Make Replacement"
DESCRIPTION = "Boost Jam is a build tool based on FTJam, which in turn is based on \
Perforce Jam. It contains significant improvements made to facilitate \
its use in the Boost Build System."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "boost1_91_0-jam-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "97531cc7e17813ec30ae470457314c22cfbf2199ed47503e3c148da196a38b2f54255b3d7b3b937118da1c1cde408ecd8c70dcfbb1f06b12cfe9e0cb1607ecff"

RPROVIDES:${PN} += "boost-1-66-jam \
boost-jam-impl \
boost1-91-0-jam"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
