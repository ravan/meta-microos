SUMMARY = "Documentation for texlive-lapdf"
DESCRIPTION = "This package includes the documentation for texlive-lapdf"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn23806"

RPM_NAME = "texlive-lapdf-doc-2026.226.1.1svn23806-63.2.noarch.rpm"
RPM_HASH = "d7530d7a11d75f9db339884299fc27df8f98358af437841ab218d660dc218170fef7e15b57b3a92a282d2a6086f3ec8c6421ba8bb7de2a574e7187f752e4b1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lapdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
