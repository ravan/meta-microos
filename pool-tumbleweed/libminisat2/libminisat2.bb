SUMMARY = "SAT solver"
DESCRIPTION = "MiniSat is a comparatively small SAT solver. It can do \
conflict-clause recording, conflict-driven backjumping, VSIDS dynamic \
variable order, two-literal watch scheme, non-clausal constraints \
over boolean variables, and variable elimination style \
simplification."
LICENSE = "MIT"

PV = "2.2.1+20230206"

RPM_NAME = "libminisat2-2.2.1+20230206-1.5.aarch64.rpm"
RPM_HASH = "c9f95ecaebd97e00455579ba9255033c14cd33b73ad70f5c615a20613c7f6688602874fdae0864fd3116524c55ad9cd21d7468b5fbd534dfc326b84f974fca38"

RPROVIDES:${PN} += "libminisat.so.2 \
libminisat2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
