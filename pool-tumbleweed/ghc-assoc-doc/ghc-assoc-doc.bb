SUMMARY = "Haskell assoc library documentation"
DESCRIPTION = "This package provides the Haskell assoc library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "ghc-assoc-doc-1.1.1-3.3.noarch.rpm"
RPM_HASH = "7558c0142f7f2b944728e382faf69268326fe04b8fe5a53c2f3f92761aa9ab22d961bf0ff83ba85901bb61f1e4bf6b940b604c74cfc8fb3ad497ec9867b7adc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-assoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
