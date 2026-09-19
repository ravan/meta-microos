SUMMARY = "Haskell typst library documentation"
DESCRIPTION = "This package provides the Haskell typst library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10"

RPM_NAME = "ghc-typst-doc-0.10-1.3.noarch.rpm"
RPM_HASH = "eb7219a9394febea76206fde7122e6d550d117a6407b5bece8e9dcb1d3101d4b82f16cb1ce445e775e406edd2f1cb25999c22b10067a013f75050b83eaa22fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typst-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
