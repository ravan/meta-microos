SUMMARY = "Documentation for texlive-geometry"
DESCRIPTION = "This package includes the documentation for texlive-geometry"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.9svn77682"

RPM_NAME = "texlive-geometry-doc-2026.226.5.9svn77682-60.2.noarch.rpm"
RPM_HASH = "91844835afda319d9ed40a32eb85309f487da61d12bc818efa45646dfe781ad1ff86e6bd09f3edc625546a59af8af126308b19440bbaed7e50fc98a64d5e39e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-geometry-doc-de;en \
texlive-geometry-doc"

RDEPENDS:${PN} += ""

inherit rpm
