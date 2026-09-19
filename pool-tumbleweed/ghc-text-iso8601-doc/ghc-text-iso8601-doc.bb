SUMMARY = "Haskell text-iso8601 library documentation"
DESCRIPTION = "This package provides the Haskell text-iso8601 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-text-iso8601-doc-0.1.1.1-1.3.noarch.rpm"
RPM_HASH = "0906c6573ca9c3d2125256a2cc1d9be9b605c9dadda50577918a2b4af5963e47f2beffdcf8b125b2814dd1ad75fd1f3b711521e80750dee6e71a043d15a9c9f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-iso8601-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
