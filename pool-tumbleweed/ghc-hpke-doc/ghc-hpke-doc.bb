SUMMARY = "Haskell hpke library documentation"
DESCRIPTION = "This package provides the Haskell hpke library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-hpke-doc-0.1.0-1.2.noarch.rpm"
RPM_HASH = "5212aaa11a3335c6ab29002f60e420143760a891b5fa4a729df21a6101e426d640f61c33e62b1eb6389bb4259364f82c4629a5f2ad39a04a3e96636af1ac91a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hpke-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
