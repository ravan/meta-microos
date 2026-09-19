SUMMARY = "Documentation for texlive-cryst"
DESCRIPTION = "This package includes the documentation for texlive-cryst"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-cryst-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "8c5008fe93664023200da3d3ffe22ff6e4c27ce0c9367206cceeef5de99810f72cca29b61cc154b4308404ca5f8ec6f962546f5ff24ab673078036ac2624feae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cryst-doc-de \
texlive-cryst-doc"

RDEPENDS:${PN} += ""

inherit rpm
