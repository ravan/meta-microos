SUMMARY = "Documentation for texlive-context-animation"
DESCRIPTION = "This package includes the documentation for texlive-context-animation"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn75386"

RPM_NAME = "texlive-context-animation-doc-2026.226.svn75386-61.2.noarch.rpm"
RPM_HASH = "bf4c762059e73f5721650c71d72917df92b44f6de8389d222682a3c3e293deeab412126d121415e9086ff84972ff98ad9ed8892a0436539943785f3244b5fb92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-animation-doc"

RDEPENDS:${PN} += ""

inherit rpm
