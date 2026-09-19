SUMMARY = "Haskell integer-logarithms library documentation"
DESCRIPTION = "This package provides the Haskell integer-logarithms library documentation."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "ghc-integer-logarithms-doc-1.0.5-1.3.noarch.rpm"
RPM_HASH = "6992c0f9a07efab99a51886ee08a3249d5848ee8f8db4065df361557be683262cc5e82bd2d315bb425f5db20bb8b053848b4e17bdf67faf5b5c6b8be83a3f209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-integer-logarithms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
