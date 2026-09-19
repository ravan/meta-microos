SUMMARY = "Documentation for texlive-fontspec"
DESCRIPTION = "This package includes the documentation for texlive-fontspec"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9gsvn77682"

RPM_NAME = "texlive-fontspec-doc-2026.226.2.9gsvn77682-60.2.noarch.rpm"
RPM_HASH = "7b44daa9cdc73f043af99429af5ae92a1e61507cb5c871777c403a49e2b186745be4d4812875c9ad8e0b0b31ee10a58c146977e2abff35bad2bde3f13b5268e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontspec-doc"

RDEPENDS:${PN} += ""

inherit rpm
