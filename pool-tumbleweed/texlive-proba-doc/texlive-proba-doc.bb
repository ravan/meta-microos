SUMMARY = "Documentation for texlive-proba"
DESCRIPTION = "This package includes the documentation for texlive-proba"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-proba-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "f17c13b08e1df20845b87f741bd0c58a4fb42771f52441ecd03b65745673c1c443c0c68f2b25a784472babc96352b37dd99a96cafcb37dd2ee7df51f60030794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proba-doc"

RDEPENDS:${PN} += ""

inherit rpm
