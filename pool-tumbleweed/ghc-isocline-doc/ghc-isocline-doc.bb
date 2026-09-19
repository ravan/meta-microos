SUMMARY = "Haskell isocline library documentation"
DESCRIPTION = "This package provides the Haskell isocline library documentation."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-doc-1.0.9-3.12.noarch.rpm"
RPM_HASH = "d34f3ff00dede1554b0fcdb6183b87a857c8f36c519c9bf6ea6a6f3cbb8f48ff0ca94d2fa385824f386a71fa8b763cd4ae41e73d3d23a74102a449ce74405f09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-isocline-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
