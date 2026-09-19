SUMMARY = "Haskell pretty library documentation"
DESCRIPTION = "This package provides the Haskell pretty library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-doc-1.1.3.6-1.3.noarch.rpm"
RPM_HASH = "b504df8cf0837d4d5e894552c0012f933decde18a0aea224e34c6e7ab2f608834110128f398ca096b36d667f282f1cb8f2d54c846ef5da1c20bcc8cca231d66c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
