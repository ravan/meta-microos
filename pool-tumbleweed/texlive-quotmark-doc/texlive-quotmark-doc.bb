SUMMARY = "Documentation for texlive-quotmark"
DESCRIPTION = "This package includes the documentation for texlive-quotmark"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-quotmark-doc-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "b2edcd15f35f114d2f62af85c840696d58e4c72689b28d4352717cc1b6f37f2ad952f0adfe615ae155e68f473eb3e3497607f3e91c28b5d1cc18766fcf1aa147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quotmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
