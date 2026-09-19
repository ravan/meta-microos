SUMMARY = "GAP: Computing the Automorphism Group of a p-Group"
DESCRIPTION = "The AutPGrp package introduces a new function to compute the \
automorphism group of a finite $p$-group. The underlying algorithm is \
a refinement of the methods described in O'Brien (1995). In \
particular, this implementation is more efficient in both time and \
space requirements and hence has a wider range of applications than \
the ANUPQ method."
LICENSE = "GPL-2.0-or-later"

PV = "1.12.0"

RPM_NAME = "gap-autpgrp-1.12.0-1.2.noarch.rpm"
RPM_HASH = "4664b59f42ff7d50b2e7583dbc9aac41109c587e31b7c2a628e2beca9f60395dbd13d788417b4813276f2de8b016fa0fc1ce4f6c3299d3c2f04abd6fff8d068f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-autpgrp"

RDEPENDS:${PN} += "gap-core"

inherit rpm
