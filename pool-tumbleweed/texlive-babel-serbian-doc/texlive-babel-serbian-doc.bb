SUMMARY = "Documentation for texlive-babel-serbian"
DESCRIPTION = "This package includes the documentation for texlive-babel-serbian"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2asvn64571"

RPM_NAME = "texlive-babel-serbian-doc-2026.226.2.2asvn64571-60.2.noarch.rpm"
RPM_HASH = "660e231fd106fc4c3458ec171a8416495fda3e223736f130d5587ba17f7ee9d394a175492ecf1e2818a87e1c8b3dc2b05ae4ac7b50124e6559974d7421e0668f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-serbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
