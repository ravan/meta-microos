SUMMARY = "Documentation for texlive-msg"
DESCRIPTION = "This package includes the documentation for texlive-msg"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.51svn49578"

RPM_NAME = "texlive-msg-doc-2026.226.0.0.51svn49578-61.2.noarch.rpm"
RPM_HASH = "ea6078a4c21a22d6c1cf745ed6e9243b3f5cc51e3f08ae288d9e37701958eb88cd0f7ddd99cbe3b8d2bdfb867021d20dbedb601489faf69e113a38f1369ea0e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-msg-doc"

RDEPENDS:${PN} += ""

inherit rpm
