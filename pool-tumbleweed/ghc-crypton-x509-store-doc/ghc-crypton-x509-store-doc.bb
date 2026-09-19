SUMMARY = "Haskell crypton-x509-store library documentation"
DESCRIPTION = "This package provides the Haskell crypton-x509-store library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "ghc-crypton-x509-store-doc-1.9.0-1.3.noarch.rpm"
RPM_HASH = "00283b49b62b7bb1bc2f94587a40969572753b9a56f1d21d59dc05689d09da6a2db682f1d96413705c123009a820f60640dbcb0f64d61c85ea9a36e93fc7ab43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-x509-store-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
