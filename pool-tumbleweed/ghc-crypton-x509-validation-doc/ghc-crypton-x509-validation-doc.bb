SUMMARY = "Haskell crypton-x509-validation library documentation"
DESCRIPTION = "This package provides the Haskell crypton-x509-validation library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "ghc-crypton-x509-validation-doc-1.9.1-1.2.noarch.rpm"
RPM_HASH = "2aa9e88e3b8a36d09c2acb8e4cbfc1c715657ef7bd82f5912174faaa04761781246f43c8afbce11604beb9d5aac40f1403f28fd6b76bfc8b0c5bb7e133163cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-x509-validation-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
