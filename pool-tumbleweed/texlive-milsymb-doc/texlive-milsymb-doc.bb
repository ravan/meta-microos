SUMMARY = "Documentation for texlive-milsymb"
DESCRIPTION = "This package includes the documentation for texlive-milsymb"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn78219"

RPM_NAME = "texlive-milsymb-doc-2026.226.1.03svn78219-61.2.noarch.rpm"
RPM_HASH = "7649ff5e20d899f396fbfe014046a6a9a2227860c8b2faa97d89f4be6deee2098bf36b8e4b5f34e9c17a69c1ad9ce054a8de3f83c8129fb73def8224090e52ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-milsymb-doc"

RDEPENDS:${PN} += ""

inherit rpm
