SUMMARY = "Haskell ordered-containers library documentation"
DESCRIPTION = "This package provides the Haskell ordered-containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-ordered-containers-doc-0.2.4-1.25.noarch.rpm"
RPM_HASH = "6fff243ce1610b7947ddc8f2afbb48d070a31a361b1790a91b627ae9f1b9f85ee96c2651e530a632364fb0c99779e4fbd5729e7d57cd223352c35e66c0138662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ordered-containers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
