SUMMARY = "Documentation for texlive-studenthandouts"
DESCRIPTION = "This package includes the documentation for texlive-studenthandouts"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn43516"

RPM_NAME = "texlive-studenthandouts-doc-2026.226.1.0svn43516-64.2.noarch.rpm"
RPM_HASH = "0867aed81f00025401231703610a99b46fc31db316b2a254fd16546385099ab0e7c1409906c4cdda98a045fe09d54416d3404428e4a7150a3dc7ca2a0b5d5508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-studenthandouts-doc"

RDEPENDS:${PN} += ""

inherit rpm
