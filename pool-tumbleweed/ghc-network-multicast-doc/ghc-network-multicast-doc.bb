SUMMARY = "Haskell network-multicast library documentation"
DESCRIPTION = "This package provides the Haskell network-multicast library documentation."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-doc-0.3.2-4.24.noarch.rpm"
RPM_HASH = "2299d8d03a545e5c1173a4b6478f0bb8dc83cfc52328d7717fce9b128cf1c3b9ca5b84cc04c1831a3c2b0dd25841d4e3118305fd584535cdf64c0d0be254f090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-multicast-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
