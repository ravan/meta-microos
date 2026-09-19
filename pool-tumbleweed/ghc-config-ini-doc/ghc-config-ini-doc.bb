SUMMARY = "Haskell config-ini library documentation"
DESCRIPTION = "This package provides the Haskell config-ini library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.0"

RPM_NAME = "ghc-config-ini-doc-0.2.7.0-2.32.noarch.rpm"
RPM_HASH = "a83515fe2231134ddcfb742e3b6066bb54de81603f1cfea92a6bb9a718ac3371252b5b51ac07202f28cf7eed7e56f61297f7bda6093aea6386ac264060b5e6b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-config-ini-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
