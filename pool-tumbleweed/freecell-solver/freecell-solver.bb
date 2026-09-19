SUMMARY = "A Freecell Solver"
DESCRIPTION = "Command line programs which can be used to solve Freecell and other card games."
LICENSE = "MIT"

PV = "6.16.0"

RPM_NAME = "freecell-solver-6.16.0-1.5.aarch64.rpm"
RPM_HASH = "13317db532d1cc8e5f1553a0ba4c62c61a1225806a2cf02fc4686ef5d11da0590eaff7e719265a6755c7bcb207f1d78971a9f345657226e0b046fae7aaf228ca"

RPROVIDES:${PN} += "freecell-solver"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreecell-solver.so.0 \
python3-pysol-cards"

inherit rpm
