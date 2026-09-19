SUMMARY = "Documentation for texlive-context-mathsets"
DESCRIPTION = "This package includes the documentation for texlive-context-mathsets"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn47085"

RPM_NAME = "texlive-context-mathsets-doc-2026.226.svn47085-61.2.noarch.rpm"
RPM_HASH = "4b3d6633c3b131e22a5ced4ffb20670b3125c74060f481fd1926def86ea59558916ce72501d98ef8ca6dc2f734477037bf5c9333344ea6d7172047dc0b244c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-mathsets-doc"

RDEPENDS:${PN} += ""

inherit rpm
