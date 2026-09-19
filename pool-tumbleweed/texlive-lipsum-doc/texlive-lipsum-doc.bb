SUMMARY = "Documentation for texlive-lipsum"
DESCRIPTION = "This package includes the documentation for texlive-lipsum"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn77682"

RPM_NAME = "texlive-lipsum-doc-2026.226.2.7svn77682-61.2.noarch.rpm"
RPM_HASH = "3bde770e698ff59eebc2f230eb1f442acf2311ba4a619ab93edecf4220972aede0c9619c9fe9565d5de5141d5762aebc676dd55e6d5e4a0fb4f2eb75683a0bc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
