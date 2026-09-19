SUMMARY = "Documentation for texlive-paresse"
DESCRIPTION = "This package includes the documentation for texlive-paresse"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0.2svn76924"

RPM_NAME = "texlive-paresse-doc-2026.226.5.0.2svn76924-58.2.noarch.rpm"
RPM_HASH = "04d037ca5d4410a787ddaf90762a3e7353685c2aacaba4a7db099f9a39722705ef9d2c2e3585d0dbb6683caa614a2b1befb79266563efcae1b7b99ec884c6b29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-paresse-doc-fr \
texlive-paresse-doc"

RDEPENDS:${PN} += ""

inherit rpm
