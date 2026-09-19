SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "The Polyhedral Library (PolyLib) operates on objects made up of \
unions of polyhedra of any dimension."
LICENSE = "MIT"

PV = "5.22.8"

RPM_NAME = "libpolylibgmp8-5.22.8-1.5.aarch64.rpm"
RPM_HASH = "8507eebb51bde49695a40901cc380794533f17d5d9dae5e1389912c0305856d55ac1b999137ae812bc526ead74315c69bd0b80d1d81ef17c54fa30698f615820"

RPROVIDES:${PN} += "libpolylibgmp.so.8 \
libpolylibgmp8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
