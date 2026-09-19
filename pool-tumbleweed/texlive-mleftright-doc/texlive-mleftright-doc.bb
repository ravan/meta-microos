SUMMARY = "Documentation for texlive-mleftright"
DESCRIPTION = "This package includes the documentation for texlive-mleftright"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-mleftright-doc-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "af1e1565386e8bc786422d8d18fa018f45fef026795e0bf283f9b19c546ff294eb9a93a3775218757583bce734bbcaaa917d5b82cf96c8b0c190a8fd67007fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mleftright-doc"

RDEPENDS:${PN} += ""

inherit rpm
