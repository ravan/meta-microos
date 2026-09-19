SUMMARY = "Documentation for texlive-memorygraphs"
DESCRIPTION = "This package includes the documentation for texlive-memorygraphs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn49631"

RPM_NAME = "texlive-memorygraphs-doc-2026.226.0.0.1.1svn49631-59.2.noarch.rpm"
RPM_HASH = "63e02a9052b91b0e01e66971381b20676f7641c9ab3de4c7aef1727dd3da020d4907a623522ed3915b93f733b32a54984f40a461508a3f54388a30bbc6f7383d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memorygraphs-doc"

RDEPENDS:${PN} += ""

inherit rpm
