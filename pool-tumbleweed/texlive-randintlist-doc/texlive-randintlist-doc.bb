SUMMARY = "Documentation for texlive-randintlist"
DESCRIPTION = "This package includes the documentation for texlive-randintlist"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn78007"

RPM_NAME = "texlive-randintlist-doc-2026.226.0.0.20asvn78007-60.4.noarch.rpm"
RPM_HASH = "a4e997833a27a0e72f974f89c263ff32e50d61a7e5f96e7950cdbebf1fe79e3f971f51031810b916b06a48bea2d9bf7299fee21b55b39461fe891c27dc37729c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randintlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
