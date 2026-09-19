SUMMARY = "Haskell unix-compat library documentation"
DESCRIPTION = "This package provides the Haskell unix-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.1"

RPM_NAME = "ghc-unix-compat-doc-0.7.4.1-1.9.noarch.rpm"
RPM_HASH = "dfb5b4021949937c9466d759fd65444298496a9f0f096a2e9d3226a5160e7d5d1f07d13795163ae9986e1aa792f5654ff75a38373245e928ba48b85d8a21da45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
