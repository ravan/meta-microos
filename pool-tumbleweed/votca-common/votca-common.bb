SUMMARY = "Architecture-independent data files for VOTCA"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains the architecture-independent data files for VOTCA."
LICENSE = "Apache-2.0"

PV = "2026"

RPM_NAME = "votca-common-2026-1.7.noarch.rpm"
RPM_HASH = "860a0ac601a37574447b8550e2b4d47c3cacaf415a30a2cb3f7e6040b3972fe44b04d49a9ed329d8a983d606ab095c36f33a13274d721f8c60e188dc21779135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "votca-common \
votca-csg-common \
votca-xtp-common"

RDEPENDS:${PN} += ""

inherit rpm
