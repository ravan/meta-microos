SUMMARY = "Documentation for texlive-glossaries-estonian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-estonian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn49928"

RPM_NAME = "texlive-glossaries-estonian-doc-2026.226.1.0svn49928-60.4.noarch.rpm"
RPM_HASH = "3a09d562d155be180ab2d8c8019ddda15617484314a01a9e24051b06bada22d69ffd5bf5e45b0ac813fd8c3855bf6e36d8db68419fdaf43aa3b1c7b380600498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-estonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
