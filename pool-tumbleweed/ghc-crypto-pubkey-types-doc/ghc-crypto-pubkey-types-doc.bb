SUMMARY = "Haskell crypto-pubkey-types library documentation"
DESCRIPTION = "This package provides the Haskell crypto-pubkey-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-crypto-pubkey-types-doc-0.4.3-1.25.noarch.rpm"
RPM_HASH = "aee04c3ee81189dab2be284d6c19a2e55ebe46f5a10d577927bc80c0d3d95573af9b62399ed766574be626390ac747810600543eaa3a1747c88d31552ebdd0c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-pubkey-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
