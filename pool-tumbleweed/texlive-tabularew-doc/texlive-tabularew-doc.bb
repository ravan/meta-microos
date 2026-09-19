SUMMARY = "Documentation for texlive-tabularew"
DESCRIPTION = "This package includes the documentation for texlive-tabularew"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn15878"

RPM_NAME = "texlive-tabularew-doc-2026.227.0.0.1svn15878-62.2.noarch.rpm"
RPM_HASH = "701436f88e5b11c51232410b7ac453eb1207050c806a9ab0c73f8dc6db1c18a9e46fe9d98a87b8343db132c6042d8105e620148acc8228f6537df3e0bb3417af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabularew-doc"

RDEPENDS:${PN} += ""

inherit rpm
