SUMMARY = "Documentation for texlive-pgfgantt"
DESCRIPTION = "This package includes the documentation for texlive-pgfgantt"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0asvn71565"

RPM_NAME = "texlive-pgfgantt-doc-2026.226.5.0asvn71565-58.2.noarch.rpm"
RPM_HASH = "c1aca856287448425c15f1699662a97b9fa8e9d01f8c845e7e9726bc66dae0caf80ac55d70da8f32a874d95f41acfa42c5d4473882e3d5b261e0e01c774d6473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfgantt-doc"

RDEPENDS:${PN} += ""

inherit rpm
