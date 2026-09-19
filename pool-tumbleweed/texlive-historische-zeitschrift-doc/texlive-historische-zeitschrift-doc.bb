SUMMARY = "Documentation for texlive-historische-zeitschrift"
DESCRIPTION = "This package includes the documentation for texlive-historische-zeitschrift"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn42635"

RPM_NAME = "texlive-historische-zeitschrift-doc-2026.226.1.2svn42635-60.4.noarch.rpm"
RPM_HASH = "995ff91875b1b200c9deb5e232c6bf93083a6774af771acf75f54572c90828be1218814aac4199a9af765a24f71ffc60ea661cba0cc5d4773fee6ab22e690af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-historische-zeitschrift-doc-de;en \
texlive-historische-zeitschrift-doc"

RDEPENDS:${PN} += ""

inherit rpm
