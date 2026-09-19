SUMMARY = "Documentation for texlive-qualitype"
DESCRIPTION = "This package includes the documentation for texlive-qualitype"
LICENSE = "OFL-1.1"

PV = "2026.226.svn54512"

RPM_NAME = "texlive-qualitype-doc-2026.226.svn54512-60.4.noarch.rpm"
RPM_HASH = "169156b8e785e74ce6133717d2fd2501eb0052d446375b62eb4413bd821acf5ff7a55f4a606e45a32d6a9f1fe262ec960ae08db5c1475b021512eeb42d3cec07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qualitype-doc"

RDEPENDS:${PN} += ""

inherit rpm
