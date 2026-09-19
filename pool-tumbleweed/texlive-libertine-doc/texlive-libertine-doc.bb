SUMMARY = "Documentation for texlive-libertine"
DESCRIPTION = "This package includes the documentation for texlive-libertine"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.5.3.0svn77682"

RPM_NAME = "texlive-libertine-doc-2026.226.5.3.0svn77682-61.2.noarch.rpm"
RPM_HASH = "1b5a21b4f84c36690137642bc10172257c000732e7d1bf55b749e06b237d374c8ad6aea0f30b08ac3216d2a6b107e1259f3f4930762526c0e1f2cc04f4293bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertine-doc"

RDEPENDS:${PN} += ""

inherit rpm
