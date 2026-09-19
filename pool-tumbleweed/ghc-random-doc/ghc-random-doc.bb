SUMMARY = "Haskell random library documentation"
DESCRIPTION = "This package provides the Haskell random library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-random-doc-1.3.1-1.10.noarch.rpm"
RPM_HASH = "3b8216bcc67fd7b09acfe4b3b0548063f33e9d50be4dc4ed4d9bb1008fae4d44318a7042ade505ff421284d298127ae7c74a6de63be5944a45b07ea59f60c9aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-random-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
