SUMMARY = "Haskell timezone-series library documentation"
DESCRIPTION = "This package provides the Haskell timezone-series library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-doc-0.1.13-4.3.noarch.rpm"
RPM_HASH = "e92f36d46ae6961111626e6a7125ee8c0153c23204fc01e1f68caed247be090437bda552e8ddddd26303a4f916f98b7af48eb5e4365037cb63dda23884e89f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timezone-series-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
