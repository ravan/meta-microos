SUMMARY = "Documentation for texlive-cascadilla"
DESCRIPTION = "This package includes the documentation for texlive-cascadilla"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8.2svn25144"

RPM_NAME = "texlive-cascadilla-doc-2026.226.1.8.2svn25144-59.2.noarch.rpm"
RPM_HASH = "c86f9150e73c56bfb977ab26862f25f1f22d54997c7e5791e6db38abfbcdce449fddd575677e9198536620b29acd58112901089564a4d2f9e678b0728cb9497a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cascadilla-doc"

RDEPENDS:${PN} += ""

inherit rpm
