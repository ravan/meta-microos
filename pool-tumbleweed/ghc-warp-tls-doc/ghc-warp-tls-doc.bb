SUMMARY = "Haskell warp-tls library documentation"
DESCRIPTION = "This package provides the Haskell warp-tls library documentation."
LICENSE = "MIT"

PV = "3.4.14"

RPM_NAME = "ghc-warp-tls-doc-3.4.14-1.6.noarch.rpm"
RPM_HASH = "cfeecad2ec7bd0a0ae9fd06dc841bef73e4ea5a5d895d2575c9e6c7e385e2adcba8549d891eb735ae1e3b6250e78a1e214668b7bde657fc8207e6d5d86223354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-warp-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
