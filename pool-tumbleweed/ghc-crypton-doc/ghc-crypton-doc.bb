SUMMARY = "Haskell crypton library documentation"
DESCRIPTION = "This package provides the Haskell crypton library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "ghc-crypton-doc-1.1.4-1.3.noarch.rpm"
RPM_HASH = "b671a56625c57c75ef0d1dac74f4a5139e07053dd6a3ba03a66374990dc6ed22badb0fefed6ac8dc0334865b1127b3299598bb8dbc0efe03761f3b9cc0e27189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
