SUMMARY = "Documentation for texlive-lebhart"
DESCRIPTION = "This package includes the documentation for texlive-lebhart"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-lebhart-doc-2026.226.svn78004-61.2.noarch.rpm"
RPM_HASH = "27abec1843d020f6be9300366b92f936ffdee8564879556fbdc802bdbefe4594adae94f2daa18729fce66baee9ade190e74060a9ed6e93d5281519cef965de77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lebhart-doc"

RDEPENDS:${PN} += ""

inherit rpm
