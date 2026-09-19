SUMMARY = "Haskell cabal2spec library documentation"
DESCRIPTION = "This package provides the Haskell cabal2spec library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "ghc-cabal2spec-doc-2.8.0-1.9.noarch.rpm"
RPM_HASH = "72d6d5db4e305234b019c719d911bd74548875d4ba50ff19a4bdc36c86d2d745c8c37b16d3b9a9120ce1baf67022d7e0022d72133491b9982e0896fcbda9745b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal2spec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
