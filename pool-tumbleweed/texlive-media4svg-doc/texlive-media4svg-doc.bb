SUMMARY = "Documentation for texlive-media4svg"
DESCRIPTION = "This package includes the documentation for texlive-media4svg"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13svn76924"

RPM_NAME = "texlive-media4svg-doc-2026.226.0.0.13svn76924-59.2.noarch.rpm"
RPM_HASH = "0a25ef2067e9eb7a6e855647c2fee300afa8aa2535eb36c8bc04f4669724093256e9e725166ec67adad4b773d181704a277b6b686423ed2e4ce7a6806f55d950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-media4svg-doc"

RDEPENDS:${PN} += ""

inherit rpm
