SUMMARY = "Haskell indexed-profunctors library documentation"
DESCRIPTION = "This package provides the Haskell indexed-profunctors library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-doc-0.1.1.1-1.18.noarch.rpm"
RPM_HASH = "c1fea4ec31bd2bf1629d6aff59c50e0b04c77d8284219fdd0f7e566cca3bfc80d709d6d000ac8d49857b708a8a8074af4e6138064ee93fb1589eb34cfc01e0ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-indexed-profunctors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
