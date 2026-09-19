SUMMARY = "Documentation for texlive-typeoutfileinfo"
DESCRIPTION = "This package includes the documentation for texlive-typeoutfileinfo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.32svn67526"

RPM_NAME = "texlive-typeoutfileinfo-doc-2026.226.0.0.32svn67526-59.2.noarch.rpm"
RPM_HASH = "3b7f59aa8c6b2ce55bf4c9e2bcbda68f63ec169a720a77eb3bcdb15253d0cbaab605cb48cf4d03e5a10972f58834e33705a01e1ee7ec860fa0ad3a32a5b4013c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typeoutfileinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
