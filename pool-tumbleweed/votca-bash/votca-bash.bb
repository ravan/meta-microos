SUMMARY = "Bash completion for votca"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains the bash completion support for votca."
LICENSE = "Apache-2.0"

PV = "2026"

RPM_NAME = "votca-bash-2026-1.7.noarch.rpm"
RPM_HASH = "5f90188f6ac09c9ad7ae66e10f4c98b568b3e2095382fe2e8c9d2eb25c295020664d92086f102b44e0721cae50527e2c8d2fdde3c2d76db95cb38f033b638e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "votca-bash \
votca-csg-bash"

RDEPENDS:${PN} += "bash-completion \
votca"

inherit rpm
