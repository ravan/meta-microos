SUMMARY = "Documentation for texlive-interlinear"
DESCRIPTION = "This package includes the documentation for texlive-interlinear"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72106"

RPM_NAME = "texlive-interlinear-doc-2026.226.1.0svn72106-60.2.noarch.rpm"
RPM_HASH = "875a3210bf9efb5fcafd6b6474cc83491ee3f74e9eb9e0921a50edb604b783f7bdeaf395f07861be56fe76c6b2cc9efb4af8ee1a12be7d1e6d948eb6abaa3a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interlinear-doc"

RDEPENDS:${PN} += ""

inherit rpm
