SUMMARY = "Haskell th-lift library documentation"
DESCRIPTION = "This package provides the Haskell th-lift library documentation."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.7"

RPM_NAME = "ghc-th-lift-doc-0.8.7-1.3.noarch.rpm"
RPM_HASH = "a56c831e834a58a07c8d8fc01c3fe4a0043bfc7398d8a4375e5bd8d25e15eb236c864842010b3f36a3532f012559684dc5f3e576d149e0972313e1a64466a26a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-lift-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
