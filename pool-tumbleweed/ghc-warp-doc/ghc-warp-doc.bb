SUMMARY = "Haskell warp library documentation"
DESCRIPTION = "This package provides the Haskell warp library documentation."
LICENSE = "MIT"

PV = "3.4.9"

RPM_NAME = "ghc-warp-doc-3.4.9-1.15.noarch.rpm"
RPM_HASH = "e870484a82131a97619597f490a722745fef554d0c1c97029ab270a7f056375584ad403fdfa71ab290101d9ed3b0d3f054e9ddfeddd46e7c7788d439bcc90977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-warp-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
