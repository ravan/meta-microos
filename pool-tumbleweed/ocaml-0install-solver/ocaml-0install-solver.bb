SUMMARY = "Package dependency solver"
DESCRIPTION = "A package dependency resolver based on a SAT solver. This was \
originally written for the 0install package manager, but is now \
generic and is also used as a solver backend for opam. The SAT solver \
is based on MiniSat and the application to package management is based \
on OPIUM (Optimal Package Install/Uninstall Manager). 0install-solver \
uses a (novel?) strategy to find the optimal solution extremely \
quickly (even for a SAT-based solver)."
LICENSE = "LGPL-2.1-or-later"

PV = "2.18"

RPM_NAME = "ocaml-0install-solver-2.18-4.1.aarch64.rpm"
RPM_HASH = "3b0e2581b7131de5205a5b74512b73b88b2af9b2c6eac7d915a921288db8da066d278846361da072f94e61a698308e1a895a647e037a1a7fd47986d862dd369c"

RPROVIDES:${PN} += "ocaml-0install-solver"

RDEPENDS:${PN} += ""

inherit rpm
