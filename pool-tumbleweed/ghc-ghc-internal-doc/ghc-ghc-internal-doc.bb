SUMMARY = "Haskell ghc-internal library documentation"
DESCRIPTION = "This package provides the Haskell ghc-internal library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.1204.0"

RPM_NAME = "ghc-ghc-internal-doc-9.1204.0-1.3.noarch.rpm"
RPM_HASH = "fcf16020e60251a234e7cba91a3ae10936b8eb673fd0bd666a919c9c402bdcd8f0bec3cd0957fd76f33fff8b94ece54a5c4058234d6785c18fc87d69579b425b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-internal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
