SUMMARY = "Documentation for texlive-resmes"
DESCRIPTION = "This package includes the documentation for texlive-resmes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn65375"

RPM_NAME = "texlive-resmes-doc-2026.226.1.0svn65375-60.4.noarch.rpm"
RPM_HASH = "967fa4e4358fc1eeb617b2174829b1355a4594944f4afdb3b3b76d086256d545a8931afe46c117cb666e80651444155ce7ae03a36468cbd80975933c461e8559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resmes-doc"

RDEPENDS:${PN} += ""

inherit rpm
