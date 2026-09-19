SUMMARY = "GAP: Finitely Presented Lie Algebras"
DESCRIPTION = "The FPLSA package uses a C program that implements a Lie Todd–Coxeter \
method for converting finitely presented Lie algebras into isomorphic \
structure constant algebras. This is called via the GAP function \
IsomorphismSCTableAlgebra."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "gap-fplsa-1.2.8-1.4.aarch64.rpm"
RPM_HASH = "c94377b1625021391bc429f50b756ec2aa47f154dd425df6244ecd7206d0ec5591a4e63dd1eb4d85b6e141565656dad1109cd415f02154e7952ca79431d386d3"

RPROVIDES:${PN} += "gap-fplsa"

RDEPENDS:${PN} += "gap-core \
libc.so.6"

inherit rpm
