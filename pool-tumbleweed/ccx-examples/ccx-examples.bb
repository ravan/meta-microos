SUMMARY = "Example problems for CalculiX"
DESCRIPTION = "CalculiX is a package designed to solve field problems. \
The method used is the finite element method. ccx-examples \
contains examples problems, together with reference data \
to check your installation."
LICENSE = "BSD-3-Clause & GPL-2.0-only & SUSE-Public-Domain"

PV = "2.23"

RPM_NAME = "ccx-examples-2.23-1.4.noarch.rpm"
RPM_HASH = "2a325313fe0fa0918a410a5df733cad98a2378422c199bda686fdcacf2686cb7ce6345bc66ad4c5317be3800381830e52c10dd47a214338135a62080409f690a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ccx-doc-/usr/share/ccx-examples-2.12/achtel2.inp \
ccx-examples"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
