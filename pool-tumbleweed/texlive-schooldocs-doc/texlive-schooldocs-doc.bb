SUMMARY = "Documentation for texlive-schooldocs"
DESCRIPTION = "This package includes the documentation for texlive-schooldocs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn73466"

RPM_NAME = "texlive-schooldocs-doc-2026.226.1.6svn73466-60.2.noarch.rpm"
RPM_HASH = "c6929ab49913a348655c397373fab25651567ad8410072d6e4a66e515941bd645cd7407d61b71f2f7a39224a10896414ce59fa0c345d6f0943c4b8dda77c5366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schooldocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
