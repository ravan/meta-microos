SUMMARY = "Documentation for texlive-exercisepoints"
DESCRIPTION = "This package includes the documentation for texlive-exercisepoints"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.3svn49590"

RPM_NAME = "texlive-exercisepoints-doc-2026.226.1.2.3svn49590-59.2.noarch.rpm"
RPM_HASH = "37a4f8841167f833ca7f418247cfa485539867b4e753cc4045a5e84338f70333946aaf894cab6937cbc4cb70da5af0aa3b1aeacfc3dae31719f8ed6389cf3cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercisepoints-doc"

RDEPENDS:${PN} += ""

inherit rpm
