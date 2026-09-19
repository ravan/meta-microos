SUMMARY = "Solitaire Solver dynamic libraries"
DESCRIPTION = "Contains the Black Hole Solitaire dynamic library."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "libblack_hole_solver1-1.14.0-1.5.aarch64.rpm"
RPM_HASH = "faab4be5aa2d2d0caaed6961121b1d84d052cb1415e3d3b9bb2cdc757120a051985cb954693ed5c1e641e909b799e50ac141451641abab4eb32a524e93ae44dc"

RPROVIDES:${PN} += "libblack-hole-solver.so.1 \
libblack-hole-solver1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxxhash.so.0"

inherit rpm
