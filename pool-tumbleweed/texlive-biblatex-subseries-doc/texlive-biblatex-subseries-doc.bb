SUMMARY = "Documentation for texlive-biblatex-subseries"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-subseries"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn76790"

RPM_NAME = "texlive-biblatex-subseries-doc-2026.226.1.2.0svn76790-61.2.noarch.rpm"
RPM_HASH = "bccfc2a984c23d72876df89458b848386f93a142e23b89d2218054f6eab1afa4204616f06f1518354f8150a47d676c0916da3d8552c55eae405cca090a5ab737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-subseries-doc"

RDEPENDS:${PN} += ""

inherit rpm
