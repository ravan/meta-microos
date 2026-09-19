SUMMARY = "Haskell tls library documentation"
DESCRIPTION = "This package provides the Haskell tls library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "ghc-tls-doc-2.4.3-1.3.noarch.rpm"
RPM_HASH = "7e0a4b65439607a3737f0d99becd852e0d0cc5bc5eb1bb7a39ea3a544999a8ea8b43fb310ab611d8e8f863530d26f78e0c180144285e189640ffc7bbcd5d594b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
