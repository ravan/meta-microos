SUMMARY = "Documentation for texlive-biblatex2bibitem"
DESCRIPTION = "This package includes the documentation for texlive-biblatex2bibitem"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.2svn77682"

RPM_NAME = "texlive-biblatex2bibitem-doc-2026.226.0.0.2.2svn77682-61.2.noarch.rpm"
RPM_HASH = "8a32e7b28b46c3f1ae2125a70d385b784e4839308e9e26107e819aee455d8506a0769f86aeb7bfd245c0f0e0951b61b65f6d4219cd26499761b60f4c7ccad3b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex2bibitem-doc"

RDEPENDS:${PN} += ""

inherit rpm
