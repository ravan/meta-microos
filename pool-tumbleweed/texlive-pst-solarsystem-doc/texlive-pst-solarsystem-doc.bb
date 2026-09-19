SUMMARY = "Documentation for texlive-pst-solarsystem"
DESCRIPTION = "This package includes the documentation for texlive-pst-solarsystem"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.15svn69675"

RPM_NAME = "texlive-pst-solarsystem-doc-2026.226.0.0.15svn69675-60.4.noarch.rpm"
RPM_HASH = "41d96db1864b0941c263bb9e56a0b8ea29967d95f5b8c6f7eadaae33608f7145ad69f67c4eb2d5875767f881b38dcfe3598d301616209417a55409b0a91856ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-solarsystem-doc"

RDEPENDS:${PN} += ""

inherit rpm
