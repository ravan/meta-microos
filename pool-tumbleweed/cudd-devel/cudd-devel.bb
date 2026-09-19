SUMMARY = "Development files for CUDD, a package for Binary Decision Diagram manipulation"
DESCRIPTION = "CUDD is a package for the manipulation of Binary Decision Diagrams \
(BDDs), Algebraic Decision Diagrams (ADDs) and Zero-suppressed Binary \
Decision Diagrams (ZDDs). \
 \
This subpackage contains the include files and library links for \
developing against cudd's libraries."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "cudd-devel-3.0.0-3.25.aarch64.rpm"
RPM_HASH = "be7b153ffb6c0c1c55c87058521c6d358424ea1690dbaaa98ba84d17da76fe4c6a999fb02497426d25ed16d7315f7550f6d1cc0a135eac185be5eca445266109"

RPROVIDES:${PN} += "cudd-devel"

RDEPENDS:${PN} += "libcudd-3-0-0-0"

inherit rpm
