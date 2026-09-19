SUMMARY = "Documentation for texlive-bullcntr"
DESCRIPTION = "This package includes the documentation for texlive-bullcntr"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.04svn15878"

RPM_NAME = "texlive-bullcntr-doc-2026.226.0.0.04svn15878-59.2.noarch.rpm"
RPM_HASH = "6dc8d5063b3fa704253c9ba6a23e6e9d8214fff69de921a46803e729704dce39c9a2dbbaa742fd45acead6584ba5d8ceeec57f7cebcd36bfc62a74dc094cd5c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bullcntr-doc"

RDEPENDS:${PN} += ""

inherit rpm
