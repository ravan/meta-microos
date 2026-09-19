SUMMARY = "Haskell indexed-profunctors profiling library"
DESCRIPTION = "This package provides the Haskell indexed-profunctors profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-prof-0.1.1.1-1.18.aarch64.rpm"
RPM_HASH = "16fe2d34e938a7e3b246c2506730c135ceb3b3b40f6c9135d4c688342eb44efbd43cd5489a1e570a271ef220a5942abd79229bde793f4ebfbaee778dc2193436"

RPROVIDES:${PN} += "ghc-indexed-profunctors-prof \
ghc-prof-indexed-profunctors-0.1.1.1-HSqEhDrwiQJ27Hm9NjzenO"

RDEPENDS:${PN} += "ghc-indexed-profunctors-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
