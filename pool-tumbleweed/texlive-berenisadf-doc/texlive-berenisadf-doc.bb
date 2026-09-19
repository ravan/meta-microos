SUMMARY = "Documentation for texlive-berenisadf"
DESCRIPTION = "This package includes the documentation for texlive-berenisadf"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-berenisadf-doc-2026.226.2.1svn77682-61.2.noarch.rpm"
RPM_HASH = "0d06e9ba86d4bc20de03df6287e3cef94d20b4f2dab51cd9c4c0eeb9b711809291347eec8502653bd04ec3c28c51159519794a8318993f10b6d9886d1fd95d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-berenisadf-doc"

RDEPENDS:${PN} += "/usr/bin/fontforge"

inherit rpm
