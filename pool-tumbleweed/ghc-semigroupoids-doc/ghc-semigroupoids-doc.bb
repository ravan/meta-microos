SUMMARY = "Haskell semigroupoids library documentation"
DESCRIPTION = "This package provides the Haskell semigroupoids library documentation."
LICENSE = "BSD-2-Clause"

PV = "6.0.2"

RPM_NAME = "ghc-semigroupoids-doc-6.0.2-1.3.noarch.rpm"
RPM_HASH = "9e8eb6b07874e9da69b1f022b050d7d9749465343c752d1a36e9c7507041abe576ecc7c7713b0b32f87a38e49808ce47efa0b4b8300e65b17b32eb7861ded999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semigroupoids-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
