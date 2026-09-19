SUMMARY = "Haskell lifted-base library documentation"
DESCRIPTION = "This package provides the Haskell lifted-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-doc-0.2.3.12-8.36.noarch.rpm"
RPM_HASH = "0ddab65d930c05d2aac6718287c214157c349bfa49fc5a864cfaf6a1e69f3f9828767aed7f86bc558be4f33597a171891cc73cbe2cc15820b76d9343010d72ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lifted-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
