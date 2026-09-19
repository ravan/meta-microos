SUMMARY = "Haskell Diff library documentation"
DESCRIPTION = "This package provides the Haskell Diff library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-Diff-doc-1.0.2-1.12.noarch.rpm"
RPM_HASH = "a857dce1c6a4fa21fd065d52643d7de918cba17f3ddc425056f57f18e38aaadf742188eb640f9799fe98ee9451405518b344db2285b736cc791de4a65449204a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Diff-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
