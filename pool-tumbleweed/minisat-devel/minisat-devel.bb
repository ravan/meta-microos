SUMMARY = "Devel files for minisat"
DESCRIPTION = "Headers and libraries for the minisat package."
LICENSE = "MIT"

PV = "2.2.1+20230206"

RPM_NAME = "minisat-devel-2.2.1+20230206-1.5.aarch64.rpm"
RPM_HASH = "da613256e8bdedad11261f76c84a2d022575c06df272fe7b1c0e238dc381e0af1cdc9fb8e05c26d3ec76289032a5d4207e766d1fbffb2e5998ba133fec83618a"

RPROVIDES:${PN} += "cmake-minisat \
minisat-devel"

RDEPENDS:${PN} += "libminisat2 \
zlib-devel"

inherit rpm
