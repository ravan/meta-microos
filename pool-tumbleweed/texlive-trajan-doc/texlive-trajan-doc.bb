SUMMARY = "Documentation for texlive-trajan"
DESCRIPTION = "This package includes the documentation for texlive-trajan"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-trajan-doc-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "9ed2828c4ad9d74bb40690387e7205d2aa4038084ccf288a62443b5a520be1786d28d0c7c20ec42466042df07d897493c63b1d06879203d9da10bf1668bb130c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trajan-doc"

RDEPENDS:${PN} += ""

inherit rpm
