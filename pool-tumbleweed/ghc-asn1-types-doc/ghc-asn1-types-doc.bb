SUMMARY = "Haskell asn1-types library documentation"
DESCRIPTION = "This package provides the Haskell asn1-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-doc-0.3.4-5.31.noarch.rpm"
RPM_HASH = "6bf425ebab027ecc088844e07af3e657791695a9cf6b94f7df6034a60fb73c8cd945ec3ad4db85e920c09ac3c6b6d94e493afe1b60dfa3940c9e53de164e020d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
