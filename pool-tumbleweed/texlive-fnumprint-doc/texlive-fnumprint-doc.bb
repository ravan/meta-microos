SUMMARY = "Documentation for texlive-fnumprint"
DESCRIPTION = "This package includes the documentation for texlive-fnumprint"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-fnumprint-doc-2026.226.1.1asvn77682-60.2.noarch.rpm"
RPM_HASH = "dc9b70b1fa1058f17ff97bc025de2db922550c354151b31b633a25af94eae07feb8113a5172810237329dc3e112491952364f55ed1be44b05fcc5a1189f050d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnumprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
