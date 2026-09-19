SUMMARY = "SAT solver"
DESCRIPTION = "MiniSat is a comparatively small SAT solver with documentation \
(through the following paper). The first version was just above 600 \
lines while containing many then-desirable features (conflict-clause \
recording, conflict-driven backjumping, VSIDS dynamic variable order, \
two-literal watch scheme), and even extensions for incremental SAT \
and for non-clausal constraints over boolean variables. \
 \
The current MiniSat v2 supports variable elimination style \
simplification, too."
LICENSE = "MIT"

PV = "2.2.1+20230206"

RPM_NAME = "minisat-2.2.1+20230206-1.5.aarch64.rpm"
RPM_HASH = "97ceb51c39e399e7760cf12885b619692fed2f246f05307a5ece47c1cc36dfc077110137c8700f24bcaa11fc09c8c6a74c44b5143e170be348759d9d9de26910"

RPROVIDES:${PN} += "minisat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libminisat.so.2 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
