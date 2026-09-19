SUMMARY = "Documentation for texlive-clrdblpg"
DESCRIPTION = "This package includes the documentation for texlive-clrdblpg"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47511"

RPM_NAME = "texlive-clrdblpg-doc-2026.226.1.0svn47511-60.2.noarch.rpm"
RPM_HASH = "6e46c8fa2921a30cde3e9c3ed5bb4030b059f4e48f24e29a250930887e991c919ce170dacde3e88e4da7fa06bca45543fe6b261708209e80498e2c82bf0a85f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrdblpg-doc"

RDEPENDS:${PN} += ""

inherit rpm
