SUMMARY = "Documentation for texlive-needspace"
DESCRIPTION = "This package includes the documentation for texlive-needspace"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3esvn77682"

RPM_NAME = "texlive-needspace-doc-2026.226.1.3esvn77682-61.2.noarch.rpm"
RPM_HASH = "8c9ad37fd3c34d35e7e74807d8e51c402a74fbb5e62d238b7c7fc7163cac63a3db83ce2e4b6bb70763a21452f716c34e4cabeabe9240d1216a1b5e9c5c634da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-needspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
