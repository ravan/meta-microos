SUMMARY = "Haskell blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.2.0"

RPM_NAME = "ghc-blaze-html-doc-0.9.2.0-2.17.noarch.rpm"
RPM_HASH = "569ad7a697d31fea6dbe7bc6efa12051978a6c5f73f3fc6835a9e3d4d171ba2ae4dff82c619e90fef7c93192bcbd4f8ae7ecb585a84a3077aa6ad7a5bc198737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
