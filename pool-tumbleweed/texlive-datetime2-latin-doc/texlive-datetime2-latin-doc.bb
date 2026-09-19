SUMMARY = "Documentation for texlive-datetime2-latin"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-latin"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47748"

RPM_NAME = "texlive-datetime2-latin-doc-2026.226.1.0svn47748-59.2.noarch.rpm"
RPM_HASH = "ce5325ce4cd44bab5d412837f34263e4df2e27be9d4a1eed704227cea96755fc2dc37345dab6020235a6f58cf23c36636fbf9167de49369307263d17ecc280a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-latin-doc"

RDEPENDS:${PN} += ""

inherit rpm
