SUMMARY = "Documentation for texlive-xytree"
DESCRIPTION = "This package includes the documentation for texlive-xytree"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn15878"

RPM_NAME = "texlive-xytree-doc-2026.226.1.5svn15878-59.4.noarch.rpm"
RPM_HASH = "bd76c1ba4376349fb858ed81f01762877f9ca12e73dc9ab95016e83378a37176ac522651906fe078092665dfbc3445907a51f48fff16367944a255d89bc6f6df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xytree-doc-en \
texlive-xytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
