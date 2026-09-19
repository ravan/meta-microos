SUMMARY = "Documentation for texlive-totpages"
DESCRIPTION = "This package includes the documentation for texlive-totpages"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.00svn77682"

RPM_NAME = "texlive-totpages-doc-2026.226.2.00svn77682-59.2.noarch.rpm"
RPM_HASH = "3bd185051400a64a66babeec348b6c727b918ffbf9f1e85a0b49256c9ed00a1e0f19b9761826ed477b12d02e5a1249c9956655ea80ecaa7ea4f3c462f790934f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-totpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
