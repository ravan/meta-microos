SUMMARY = "Haskell QuickCheck library documentation"
DESCRIPTION = "This package provides the Haskell QuickCheck library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.15.0.1"

RPM_NAME = "ghc-QuickCheck-doc-2.15.0.1-2.15.noarch.rpm"
RPM_HASH = "78ff90b59f081e1e107a48132133d2a03d1c1777f6654ff13af07ed4486a3fc003633dbaa4f80a68248e0f8d992e7d01ddf838fe2f20529cf29fda0339e0df8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-QuickCheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
