SUMMARY = "Documentation for texlive-lie-hasse"
DESCRIPTION = "This package includes the documentation for texlive-lie-hasse"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn75301"

RPM_NAME = "texlive-lie-hasse-doc-2026.226.1.02svn75301-61.2.noarch.rpm"
RPM_HASH = "d12ad0214e244354880ce83aa01afb9f894216071172851b51848e345f6be323c2035499da59416eab31d9a1cf2965fb07af1e367d272865fec0fa9049dce444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lie-hasse-doc"

RDEPENDS:${PN} += ""

inherit rpm
