SUMMARY = "Documentation for texlive-math-operator"
DESCRIPTION = "This package includes the documentation for texlive-math-operator"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn76273"

RPM_NAME = "texlive-math-operator-doc-2026.226.1.3asvn76273-59.2.noarch.rpm"
RPM_HASH = "0140bc8a2a9f9fcd3e11f906199d4cd1355c7781f14a724e82db667e49fc040230c9ac3dae9dfe4844f86ea1445900f97f59395cacc239da13883f7ffdf84292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-math-operator-doc"

RDEPENDS:${PN} += ""

inherit rpm
