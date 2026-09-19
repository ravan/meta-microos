SUMMARY = "Documentation for texlive-cistercian"
DESCRIPTION = "This package includes the documentation for texlive-cistercian"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn77682"

RPM_NAME = "texlive-cistercian-doc-2026.226.0.0.6svn77682-60.2.noarch.rpm"
RPM_HASH = "dfc53dca7ebb65f97bd6cf7d56744ddfcbb0e15b0e363e5f557b3df2bceb8d6629bab134a57101f854e59b6c6ca788fea4cd9f60561b4e39aca05b45ae3ae119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cistercian-doc"

RDEPENDS:${PN} += ""

inherit rpm
