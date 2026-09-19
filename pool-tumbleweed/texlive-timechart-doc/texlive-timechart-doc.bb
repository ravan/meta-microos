SUMMARY = "Documentation for texlive-timechart"
DESCRIPTION = "This package includes the documentation for texlive-timechart"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.56.1svn76924"

RPM_NAME = "texlive-timechart-doc-2026.226.0.0.56.1svn76924-59.2.noarch.rpm"
RPM_HASH = "286d1d79fd350083e4761ea18587c5377e4aba0feb7f378152bf1d681dc15ba12b87c0192e68dd9585c0d452363711a85d2acc81b53b88a197780facc684f850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-timechart-doc"

RDEPENDS:${PN} += ""

inherit rpm
