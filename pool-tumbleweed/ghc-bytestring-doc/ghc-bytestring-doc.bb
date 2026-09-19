SUMMARY = "Haskell bytestring library documentation"
DESCRIPTION = "This package provides the Haskell bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.12.2.0"

RPM_NAME = "ghc-bytestring-doc-0.12.2.0-1.3.noarch.rpm"
RPM_HASH = "1edfe824911b65a0d1084aa1569a59c9388a7b1a41b19cd0a013b25e7f4b851700266d6c2b2854f604a0592063b38e5349dfd92a77b2a6cc11ed04516aabab08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
