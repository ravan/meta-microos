SUMMARY = "Documentation for texlive-sffms"
DESCRIPTION = "This package includes the documentation for texlive-sffms"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-sffms-doc-2026.226.2.0svn15878-60.2.noarch.rpm"
RPM_HASH = "dde64fc2fbcf49946adae17407d57cc83b8ab4539d68d93dacbb6d5cb41ff6cf6dc19071725b43fc4b02e75e28ea497472ddafe41c528a044c15915bbd504153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sffms-doc"

RDEPENDS:${PN} += ""

inherit rpm
