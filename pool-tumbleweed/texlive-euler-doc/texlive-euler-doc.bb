SUMMARY = "Documentation for texlive-euler"
DESCRIPTION = "This package includes the documentation for texlive-euler"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5svn77682"

RPM_NAME = "texlive-euler-doc-2026.226.2.5svn77682-59.2.noarch.rpm"
RPM_HASH = "0076571623fddc552d3204b66fee40c53940e41b6b67a9a041f645140686734340647eb64bf255ca039819278035dd26a4931ada7a7e9ad930512ee06df3075f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euler-doc"

RDEPENDS:${PN} += ""

inherit rpm
