SUMMARY = "Documentation for superlu"
DESCRIPTION = "Documentation (HTML/PDF) for SuperLU. \
SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "superlu-doc-7.0.1-1.5.noarch.rpm"
RPM_HASH = "d688ebc8886c3c5947675353119c7b9709b0aeab3cc9b8bfd2718fa5d7add6ea856cdd9aa260fdcd4aa64d3e1089196c936c660730b1ea605f881df1bb566b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-doc"

RDEPENDS:${PN} += ""

inherit rpm
