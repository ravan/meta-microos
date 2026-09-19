SUMMARY = "Documentation for texlive-beamerappendixnote"
DESCRIPTION = "This package includes the documentation for texlive-beamerappendixnote"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn55732"

RPM_NAME = "texlive-beamerappendixnote-doc-2026.226.1.2.0svn55732-61.2.noarch.rpm"
RPM_HASH = "7604d71f84323e29b3ef30b7bbd22a309182723bb8a8dcd93667c43048a19f14b030bdfbdc35dea15e84bf26b1173ac6ccfea88022875f59fb25720a70c351f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerappendixnote-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
