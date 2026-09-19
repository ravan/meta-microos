SUMMARY = "Haskell parsec library documentation"
DESCRIPTION = "This package provides the Haskell parsec library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.18.0"

RPM_NAME = "ghc-parsec-doc-3.1.18.0-1.3.noarch.rpm"
RPM_HASH = "94be101046bf1d396fee921a91b0701e0d853b588f701d5e03b1d2ae1e0acd6bcdffb777be4e04a99b14cf9da5f1689af60950ee7fee6a0b506a63c544f54b16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
