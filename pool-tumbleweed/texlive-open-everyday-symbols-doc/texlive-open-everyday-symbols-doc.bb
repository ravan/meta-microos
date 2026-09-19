SUMMARY = "Documentation for texlive-open-everyday-symbols"
DESCRIPTION = "This package includes the documentation for texlive-open-everyday-symbols"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn75127"

RPM_NAME = "texlive-open-everyday-symbols-doc-2026.226.1.1svn75127-61.2.noarch.rpm"
RPM_HASH = "08e0920a7ab60352f8274e24c01e6883a472ea17adc1a9532c9e5fc16fbaab3e65b61674805a11446144dd22e2ee493913acf6299077b75c7a3bc4c8fd071924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-open-everyday-symbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
