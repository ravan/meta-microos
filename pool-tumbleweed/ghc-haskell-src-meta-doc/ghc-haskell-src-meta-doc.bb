SUMMARY = "Haskell haskell-src-meta library documentation"
DESCRIPTION = "This package provides the Haskell haskell-src-meta library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.15"

RPM_NAME = "ghc-haskell-src-meta-doc-0.8.15-2.3.noarch.rpm"
RPM_HASH = "0e2eb90d29d22dacc22609079959ea07297660f9a3890753db646babb5cf0aa8cbf225db97712e311161d55ec8deab3a123e23c544a4704e742d6a3f63c5ac21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haskell-src-meta-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
