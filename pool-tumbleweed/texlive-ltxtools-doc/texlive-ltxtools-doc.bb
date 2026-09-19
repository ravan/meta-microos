SUMMARY = "Documentation for texlive-ltxtools"
DESCRIPTION = "This package includes the documentation for texlive-ltxtools"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1asvn24897"

RPM_NAME = "texlive-ltxtools-doc-2026.226.0.0.0.1asvn24897-59.2.noarch.rpm"
RPM_HASH = "2d4e087f633537d5a112b2f5b2a835bca32c503f5d47373b79e834bbd8c08e1a74f0b67c3a468c5e5830c30cfda67ed36a036d4bfa96928b3596316636bd4aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
