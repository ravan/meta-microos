SUMMARY = "Documentation for texlive-hhtensor"
DESCRIPTION = "This package includes the documentation for texlive-hhtensor"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.61svn54080"

RPM_NAME = "texlive-hhtensor-doc-2026.226.0.0.61svn54080-60.4.noarch.rpm"
RPM_HASH = "a055f1c731ffa48d1c53871f012769534114fed91847be32ac5a2ae8d6917c1e0e831187572b5abc559c22ba4e6db193ab8eadcfa0e569dcfe1d5ed9109d3be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hhtensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
