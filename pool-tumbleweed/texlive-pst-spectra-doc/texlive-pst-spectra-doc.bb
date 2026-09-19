SUMMARY = "Documentation for texlive-pst-spectra"
DESCRIPTION = "This package includes the documentation for texlive-pst-spectra"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn15878"

RPM_NAME = "texlive-pst-spectra-doc-2026.226.0.0.91svn15878-60.4.noarch.rpm"
RPM_HASH = "8ff132d9ef8a0355aa16e490757604f67d5f6435b12c1bd37760df5f22fb3ca9000e3c8c802aa97fcb0a44b07c98c7afb7ae49b8d4dc6ea0b38a9ad4c2ac486e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-spectra-doc-fr;en \
texlive-pst-spectra-doc"

RDEPENDS:${PN} += ""

inherit rpm
