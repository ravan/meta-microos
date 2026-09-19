SUMMARY = "Haskell split library documentation"
DESCRIPTION = "This package provides the Haskell split library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-split-doc-0.2.5-1.16.noarch.rpm"
RPM_HASH = "6487566fc0c6e6d6dc216f5ddefd47195fca58d698c229be998b935cc65300d20dae1bf7b5d468b58bf6bee220ee09666c85c40e185226a1413fb8bc2e0e524d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-split-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
