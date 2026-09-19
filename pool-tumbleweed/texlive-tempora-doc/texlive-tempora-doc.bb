SUMMARY = "Documentation for texlive-tempora"
DESCRIPTION = "This package includes the documentation for texlive-tempora"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.05svn77682"

RPM_NAME = "texlive-tempora-doc-2026.227.1.05svn77682-62.2.noarch.rpm"
RPM_HASH = "77e4b772ab3782c09a39eb8bd70fd03e2dada5caab915bcf90d4fe5c6aedf6369ce76dc770b29a82db3e3834536b5a4199ea5c7b71d1fd9ba7bd8512cc5171d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tempora-doc"

RDEPENDS:${PN} += ""

inherit rpm
