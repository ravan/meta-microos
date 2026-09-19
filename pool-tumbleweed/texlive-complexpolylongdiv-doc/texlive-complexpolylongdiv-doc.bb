SUMMARY = "Documentation for texlive-complexpolylongdiv"
DESCRIPTION = "This package includes the documentation for texlive-complexpolylongdiv"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76639"

RPM_NAME = "texlive-complexpolylongdiv-doc-2026.226.0.0.2svn76639-60.2.noarch.rpm"
RPM_HASH = "fb69fc92dd8fc4c63ca757d08f64eeccf5479349de7441ec21e325d2d572756f6a2d87071f952c7695c7b4c00ee2eb31c36a6f37e4f887c2be74768c5acc5929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-complexpolylongdiv-doc"

RDEPENDS:${PN} += ""

inherit rpm
