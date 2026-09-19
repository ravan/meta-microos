SUMMARY = "Documentation for texlive-figureversions"
DESCRIPTION = "This package includes the documentation for texlive-figureversions"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn75069"

RPM_NAME = "texlive-figureversions-doc-2026.226.1.0.1svn75069-59.2.noarch.rpm"
RPM_HASH = "a11140d627580e05a6617d97454697d172b957dc696cf0a8968016d8e36cccf4c6d7b9646008fd95297bbb026be6abfb3e73ce8ecf04c702277593b893f942c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figureversions-doc"

RDEPENDS:${PN} += ""

inherit rpm
