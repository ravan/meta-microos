SUMMARY = "Haskell asn1-parse library documentation"
DESCRIPTION = "This package provides the Haskell asn1-parse library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-doc-0.9.5-6.24.noarch.rpm"
RPM_HASH = "b67b82524b155ec4082ae0f757f33a626a7e0cc7548b643b8ceb351e02a78bb6720d2a5360aa7b7e3c4a996c9da40d90fb4cc393922c8084299e244ff556b0b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-parse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
