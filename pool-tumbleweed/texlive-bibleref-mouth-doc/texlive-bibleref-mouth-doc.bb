SUMMARY = "Documentation for texlive-bibleref-mouth"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-mouth"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn25527"

RPM_NAME = "texlive-bibleref-mouth-doc-2026.226.1.0svn25527-61.2.noarch.rpm"
RPM_HASH = "48682644da6ec8d442e0a68de031d1c3d95291868837f4a8612d4124e868b3aa800c197a30961aa39e0296a1ba0ae22004af6d5b99a8097cb541b27266d87406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-mouth-doc"

RDEPENDS:${PN} += ""

inherit rpm
