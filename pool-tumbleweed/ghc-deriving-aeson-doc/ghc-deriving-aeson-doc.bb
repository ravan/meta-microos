SUMMARY = "Haskell deriving-aeson library documentation"
DESCRIPTION = "This package provides the Haskell deriving-aeson library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.10"

RPM_NAME = "ghc-deriving-aeson-doc-0.2.10-1.22.noarch.rpm"
RPM_HASH = "3086ee868e788763f08108e7a38da66c5ad6aa43daac754d3eae9db7cbfdc7a2344680b5351fd92b6c2624b7c2f4cee922b10fa0125efe213acd871b1360f5ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-deriving-aeson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
