SUMMARY = "Documentation for texlive-substances"
DESCRIPTION = "This package includes the documentation for texlive-substances"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2asvn76924"

RPM_NAME = "texlive-substances-doc-2026.226.0.0.2asvn76924-64.2.noarch.rpm"
RPM_HASH = "a1f2b8aac90fb6ad4ce95be211e7c7f3e4f3964b83722e6369f3c45c17467b65dd39c2ce5265cfce22cc96e2329cb5fc908f9b13ec1ef4860ec307c3fe4e3dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-substances-doc"

RDEPENDS:${PN} += ""

inherit rpm
