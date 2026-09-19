SUMMARY = "Documentation for texlive-graphviz"
DESCRIPTION = "This package includes the documentation for texlive-graphviz"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.94svn31517"

RPM_NAME = "texlive-graphviz-doc-2026.226.0.0.94svn31517-60.4.noarch.rpm"
RPM_HASH = "6e6eb50b3362a3d265f399fb0901915135fb76c5943739aa2939737a2a449fd057b4ddb056b31c8a71242b887fdeff9ddd2d0b521d3793a93346c60e81647ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphviz-doc"

RDEPENDS:${PN} += ""

inherit rpm
