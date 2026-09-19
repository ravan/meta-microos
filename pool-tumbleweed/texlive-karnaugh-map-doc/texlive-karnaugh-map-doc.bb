SUMMARY = "Documentation for texlive-karnaugh-map"
DESCRIPTION = "This package includes the documentation for texlive-karnaugh-map"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn61614"

RPM_NAME = "texlive-karnaugh-map-doc-2026.226.2.0svn61614-63.2.noarch.rpm"
RPM_HASH = "5cb15447a0e9a63f0925bc6330316ecf737507bcb07113064a427fd482e3b5f2b29a125e96c017d9b0e8bd1f2e2209f0bee5c25bf59d53ecb764f86bba99ac96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-karnaugh-map-doc"

RDEPENDS:${PN} += ""

inherit rpm
