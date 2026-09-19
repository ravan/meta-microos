SUMMARY = "Documentation for texlive-mlawriter"
DESCRIPTION = "This package includes the documentation for texlive-mlawriter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn67558"

RPM_NAME = "texlive-mlawriter-doc-2026.226.1.1.0svn67558-61.2.noarch.rpm"
RPM_HASH = "830cdad9ea0c3f76f052fbc2f2aa762f59b8d80ac23e21d0769c7898cb9f0b54d7141378cd3d2c246250bb0d34745f078318d6c5934fafee997c700f415928a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mlawriter-doc"

RDEPENDS:${PN} += ""

inherit rpm
