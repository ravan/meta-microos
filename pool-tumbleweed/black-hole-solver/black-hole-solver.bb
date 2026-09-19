SUMMARY = "The Black Hole Solver Executable"
DESCRIPTION = "This is a solver, written in C, to solve the Solitaire variant called “Black \
Hole” and the one called “All in a Row”. It provides a portable C library, and \
a command line application that after being fed with a layout will emit the \
cards to move."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "black-hole-solver-1.14.0-1.5.aarch64.rpm"
RPM_HASH = "2f6f975653ded4acb2ab12350f07fb1e248cea66b422dd4c0735329429a6e87c28ec7efe28a9b6e1d1dee200185ff509fa8fe848c2e56efdcdf831e77258915c"

RPROVIDES:${PN} += "black-hole-solver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblack-hole-solver.so.1 \
libc.so.6"

inherit rpm
