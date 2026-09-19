SUMMARY = "Documentation for texlive-shuffle"
DESCRIPTION = "This package includes the documentation for texlive-shuffle"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn78101"

RPM_NAME = "texlive-shuffle-doc-2026.226.1.0svn78101-60.2.noarch.rpm"
RPM_HASH = "122f3aafe2a346229e45bb4244e3aad92321010aa8a32ef0006399dfd4729856ffecf4fa6517640a08151de953cf33c09b9d93739267db90246a07f990866663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shuffle-doc"

RDEPENDS:${PN} += ""

inherit rpm
