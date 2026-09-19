SUMMARY = "Documentation for texlive-eledform"
DESCRIPTION = "This package includes the documentation for texlive-eledform"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn38114"

RPM_NAME = "texlive-eledform-doc-2026.226.1.1asvn38114-61.4.noarch.rpm"
RPM_HASH = "51b796c5a74bf1280a570210b2a2737028a1065373cbfed7d130b83d49dff166f32083add0a31562f1610a7a95e61b73a1ac883af3231bd2b20fdda1420d33fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eledform-doc"

RDEPENDS:${PN} += ""

inherit rpm
