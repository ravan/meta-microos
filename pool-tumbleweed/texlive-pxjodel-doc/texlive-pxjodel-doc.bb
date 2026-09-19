SUMMARY = "Documentation for texlive-pxjodel"
DESCRIPTION = "This package includes the documentation for texlive-pxjodel"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn77682"

RPM_NAME = "texlive-pxjodel-doc-2026.226.0.0.3asvn77682-60.4.noarch.rpm"
RPM_HASH = "93c9fa154434cc0351c2bbb73c63b7d1dd395753fc94b20cb52f3369cf6ddc193166603ceb9cf4d44a9d591d91dd8d3033dc214939a8f1114d40c8547db24962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxjodel-doc"

RDEPENDS:${PN} += ""

inherit rpm
