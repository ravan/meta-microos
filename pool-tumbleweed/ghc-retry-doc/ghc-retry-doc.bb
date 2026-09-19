SUMMARY = "Haskell retry library documentation"
DESCRIPTION = "This package provides the Haskell retry library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.3.1"

RPM_NAME = "ghc-retry-doc-0.9.3.1-1.15.noarch.rpm"
RPM_HASH = "ffc6eee314c16cb6c191d49882423fead846bce36ebe33b81d82c62f893504a18be2110aed2da84f5d7e0ffa0375787b0709fb3bee9640b35260ed3a54876d56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-retry-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
