SUMMARY = "Haskell topograph library documentation"
DESCRIPTION = "This package provides the Haskell topograph library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ghc-topograph-doc-1.0.1-2.21.noarch.rpm"
RPM_HASH = "64e985ee0d91e7c5c5824be2fa8c8f79ba9d1a5f3aa8d32c0d8449fe41e9ee8d07494737c478e941d7504145e7c878fae04de61a98f56ea5ae9fc3451b89e771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-topograph-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
