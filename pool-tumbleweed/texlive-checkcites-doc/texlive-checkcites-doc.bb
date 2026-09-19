SUMMARY = "Documentation for texlive-checkcites"
DESCRIPTION = "This package includes the documentation for texlive-checkcites"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.8svn73120"

RPM_NAME = "texlive-checkcites-doc-2026.226.2.8svn73120-60.2.noarch.rpm"
RPM_HASH = "3456f925816ae81a5026c1bc09606a2096e10aec69e35172c4a8c4ae0e39c901dd9657b109ffaaec0a7ddd52705797519428fb48fa94b12750d2be24a37c3742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checkcites-doc"

RDEPENDS:${PN} += ""

inherit rpm
