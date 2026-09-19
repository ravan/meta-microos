SUMMARY = "A Mixed Integer Linear Programming (MILP) Solver Library"
DESCRIPTION = "Mixed Integer Linear Programming (MILP) solver library lpsolve solves \
pure linear, (mixed) integer/binary, semi-continuous and special \
ordered sets (SOS) models."
LICENSE = "LGPL-2.0+"

PV = "5.5.2.0"

RPM_NAME = "liblpsolve55-0-5.5.2.0-10.39.aarch64.rpm"
RPM_HASH = "87a3903053bcadce748f7a0fe584002be87efb6f11de24bd1534e18d5ad8e0bab7f0217ab62adc65baee4335fd4ee2383c28fc6f6ae7ccf3cc329474c6da868a"

RPROVIDES:${PN} += "liblpsolve55 \
liblpsolve55-0 \
liblpsolve55.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
