SUMMARY = "Documentation for texlive-indextools"
DESCRIPTION = "This package includes the documentation for texlive-indextools"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7.0svn68555"

RPM_NAME = "texlive-indextools-doc-2026.226.1.7.0svn68555-60.2.noarch.rpm"
RPM_HASH = "67823e286fd0fe4bf4ec343147b99406de881cfec5c104c517e8e9a6da9846f9d3432da7c040e5d4d42db76dcefd1a6f7e905440829869f830985fd14e4389a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-indextools-doc"

RDEPENDS:${PN} += ""

inherit rpm
