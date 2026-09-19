SUMMARY = "Haskell unordered-containers library documentation"
DESCRIPTION = "This package provides the Haskell unordered-containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.21"

RPM_NAME = "ghc-unordered-containers-doc-0.2.21-2.3.noarch.rpm"
RPM_HASH = "cebb84f4ea6124e43dd85de8a549e3f9673dad8e0cf336a2fdf59dbf128aca01a83a28957a79141e340e43576d9d5f60f036bc9dc7bbcaa4bce2aa6783244d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unordered-containers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
