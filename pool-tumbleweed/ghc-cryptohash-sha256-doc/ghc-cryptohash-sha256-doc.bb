SUMMARY = "Haskell cryptohash-sha256 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-doc-0.11.102.1-7.15.noarch.rpm"
RPM_HASH = "3c003b6326f0fcc26467a01455b3caf75cd78e03239b44fdc6da7b496e2f6ebbb0d8e5b00b53a7ec93ce65354cb2aac83b6b9d8bb52ef7f05b2a0c1d8eb0ae9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
