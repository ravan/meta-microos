SUMMARY = "Haskell th-lift-instances library documentation"
DESCRIPTION = "This package provides the Haskell th-lift-instances library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.20"

RPM_NAME = "ghc-th-lift-instances-doc-0.1.20-2.36.noarch.rpm"
RPM_HASH = "1797333b880aeb01b68cedc89d4c034b208bf60d06027e1b9eb8ccc0a546f04a80912cce89d8857453ca16ad44392279ea97a7c8278246e65af7b369c20eb5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-lift-instances-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
