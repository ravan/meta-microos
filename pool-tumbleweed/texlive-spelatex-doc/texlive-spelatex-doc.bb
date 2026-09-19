SUMMARY = "Documentation for texlive-spelatex"
DESCRIPTION = "This package includes the documentation for texlive-spelatex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.95svn76924"

RPM_NAME = "texlive-spelatex-doc-2026.226.0.0.95svn76924-64.2.noarch.rpm"
RPM_HASH = "e2fdf202bf79702397b3242ef334ad06b959e9608c7eabe05bc182ec8543b43aa7234f44cc7f38b00d8068a84aa9c95e6fa0e1b03651173f71c8644cb4d9d8b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spelatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
