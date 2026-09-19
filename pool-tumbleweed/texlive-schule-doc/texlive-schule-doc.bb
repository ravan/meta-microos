SUMMARY = "Documentation for texlive-schule"
DESCRIPTION = "This package includes the documentation for texlive-schule"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11.0svn77551"

RPM_NAME = "texlive-schule-doc-2026.226.0.0.11.0svn77551-60.2.noarch.rpm"
RPM_HASH = "b63c3bc2906a1c1600264b94d66f8865e6817bcf7841c96b78acf7dbe348afe7884222c0fb92cacfb761bf30a0fcc1c232d74f1a591476aef432d3ed5c1843f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-schule-doc-de \
texlive-schule-doc"

RDEPENDS:${PN} += ""

inherit rpm
