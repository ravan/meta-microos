SUMMARY = "A Mixed Integer Linear Programming (MILP) Solver"
DESCRIPTION = "Mixed Integer Linear Programming (MILP) solver lpsolve solves pure \
linear, (mixed) integer/binary, semi-continuous and special ordered \
sets (SOS) models."
LICENSE = "LGPL-2.0+"

PV = "5.5.2.0"

RPM_NAME = "lpsolve-5.5.2.0-10.39.aarch64.rpm"
RPM_HASH = "8e9de75b33de6bf5c8d9dead557c05c1215ba2744577a7637faab8085734d3a3e5947b813563206f8df1564b39c57c9b1ccc3b4a4cadd4ac418fb0f288dbb77d"

RPROVIDES:${PN} += "lpsolve"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblpsolve55.so.0"

inherit rpm
