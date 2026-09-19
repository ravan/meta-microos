SUMMARY = "Documentation for texlive-lni"
DESCRIPTION = "This package includes the documentation for texlive-lni"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-lni-doc-2026.226.2.0svn77682-61.2.noarch.rpm"
RPM_HASH = "fc52ed2c2aeb51cd90e58ef7160fbdef55364276ea965dbb41c6a7141e5ec54d5ebeb198c71af0d70be53fb7daa074a1275abd47452e1eb3e9bd452e6dfa77cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lni-doc"

RDEPENDS:${PN} += ""

inherit rpm
