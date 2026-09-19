SUMMARY = "Documentation for texlive-mandi"
DESCRIPTION = "This package includes the documentation for texlive-mandi"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2.2svn76924"

RPM_NAME = "texlive-mandi-doc-2026.226.3.2.2svn76924-59.2.noarch.rpm"
RPM_HASH = "8b0e81b3b3bcd5a31d3c2aa0e6a6cee9a535320acab2da062fa4fa04c92e7a85de41d02a3e9a900588705ccbf0883ba094be454c34b2402966473f0dc78ce52e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mandi-doc"

RDEPENDS:${PN} += ""

inherit rpm
