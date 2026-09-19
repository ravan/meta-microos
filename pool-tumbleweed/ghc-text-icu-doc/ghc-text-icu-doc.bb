SUMMARY = "Haskell text-icu library documentation"
DESCRIPTION = "This package provides the Haskell text-icu library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.0.5"

RPM_NAME = "ghc-text-icu-doc-0.8.0.5-3.3.noarch.rpm"
RPM_HASH = "7402d5e27e9e59b620c5d7a3938f367b5c58f241d3a24094bf43ce9afed055ab8dad88886f21074df82f53725781a58dca4410b87175fd738332ae9bcb6d3522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-icu-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
