SUMMARY = "Documentation for texlive-mathpazo"
DESCRIPTION = "This package includes the documentation for texlive-mathpazo"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.003svn77682"

RPM_NAME = "texlive-mathpazo-doc-2026.226.1.003svn77682-59.2.noarch.rpm"
RPM_HASH = "28e273c536e8260a252fd2dbfac1fd0ede664fc0b08acc0947f4ece7cceba8aee6518ed5a525fba1ed98add2835b6f2035257844cde7d9b0449b940627598842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathpazo-doc"

RDEPENDS:${PN} += ""

inherit rpm
