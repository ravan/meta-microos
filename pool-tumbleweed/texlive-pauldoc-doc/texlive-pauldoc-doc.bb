SUMMARY = "Documentation for texlive-pauldoc"
DESCRIPTION = "This package includes the documentation for texlive-pauldoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn16005"

RPM_NAME = "texlive-pauldoc-doc-2026.226.0.0.5svn16005-58.2.noarch.rpm"
RPM_HASH = "2d47fa92b1c875b2430b581ce933af7c311eab5c3fa3903bf4702d75b1eec2154fee6ea7389339f6a0f7fd2194be5626fc01555b010e5421f65f37a0fb297d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pauldoc-doc-de \
texlive-pauldoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
