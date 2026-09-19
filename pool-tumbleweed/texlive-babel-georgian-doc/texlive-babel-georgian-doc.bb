SUMMARY = "Documentation for texlive-babel-georgian"
DESCRIPTION = "This package includes the documentation for texlive-babel-georgian"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn45864"

RPM_NAME = "texlive-babel-georgian-doc-2026.226.2.2svn45864-60.2.noarch.rpm"
RPM_HASH = "684376f03cff427d572ff00fa69ed367c4b70da3dbe8944766c1cf817f97710081bb937e80bcbfeb6ffd3a06317da816dbf07fe23f98aeef144e5c71d8c591e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-georgian-doc"

RDEPENDS:${PN} += ""

inherit rpm
